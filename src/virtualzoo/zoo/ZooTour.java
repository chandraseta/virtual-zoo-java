package virtualzoo.zoo;

import java.awt.Point;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import virtualzoo.animal.Animal;
import virtualzoo.misc.Person;

/**
 * Kelas Zoo merupakan kelas untuk memfasilitasi
 * tour pada Zoo.
 *
 * @author Felix Limanta - 13515065
 * @version 3.0
 * @since 3.0
 */
public class ZooTour {

  /**
   * Zoo yang akan dijelajahi.
   */
  private Zoo zoo;

  /**
   * Point batas kiri atas Zoo.
   */
  private Point upperLeft;

  /**
   * Point batas kanan bawah Zoo.
   */
  private Point lowerRight;

  /**
   * Visitor yang akan menjelajahi Zoo.
   */
  private Person visitor;

  /**
   * Matriks yang menandakan apakah suatu petak
   * sudah dikunjungi atau belum.
   */
  private boolean[][] visited;

  /**
   * Konstruktor.
   * Memanggil mode Tour Zoo.
   *
   * @param zoo Zoo yang akan dijelajahi.
   */
  public ZooTour(Zoo zoo) {
    this.zoo = zoo;
    visitor = new Person();

    initializeMatrixOfVisited();
    zoo.listAllEntranceExit();
    chooseEntrance();

    tourZoo();
    visitor.resetPosition();
  }

  /**
   * Menginisialisasi matriks telah dikunjungi
   * berdasarkan apakah suatu petak dapat dikunjungi.
   */
  private void initializeMatrixOfVisited() {
    visited = new boolean[zoo.getWidth()][zoo.getLength()];
    for (int i = 0; i < zoo.getWidth(); ++i) {
      for (int j = 0; j < zoo.getLength(); ++j) {
        visited[i][j] = !(zoo.getMap()[i][j].isAccessible());
      }
    }
  }

  /**
   * Memilih tempat masuk Visitor secara acak.
   */
  private void chooseEntrance() {
    Set<Point> entrance = zoo.getEntrance();
    int entranceNo = ThreadLocalRandom.current().nextInt(0, entrance.size());
    int i = 0;
    for (Point p : entrance) {
      if (i == entranceNo) {
        visitor.setPosition(p);
        visited[(int) p.getY()][(int) p.getX()] = true;
      }
      i++;
    }
  }

  /**
   * Menjelajahi Zoo sampai menemui pintu keluar atau
   * tidak dapat bergerak.
   */
  private void tourZoo() {
    boolean onExit;
    boolean hasMovesLeft = true;
    upperLeft = new Point(0, 0);
    lowerRight = new Point(zoo.getLength() - 1, zoo.getWidth() - 1);
    do {
      printZoo();
      interactWithAnimals();

      System.out.println("\nPress enter to continue");
      new Scanner(System.in).nextLine();

      onExit = zoo.getExit().contains(visitor.getPosition());
      if (!onExit) {
        hasMovesLeft = moveVisitor();
        moveAnimals();
      }
    } while (!onExit && hasMovesLeft);

    if (onExit) {
      System.out.println("Visitor exited successfully");
    } else {
      System.out.println("Visitor has nowhere to go");
    }
  }

  /**
   * Menampilkan kondisi Zoo saat setelah pergerakan Visitor dan Animal.
   */
  private void printZoo() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    zoo.renderMap(visitor);
    new ZooDisplay(zoo).printMap(upperLeft, lowerRight);
  }

  /**
   * Menampilkan interaksi Visitor dengan Animal.
   */
  private void interactWithAnimals() {
    Point visitorLoc = visitor.getPosition();
    for (Cage c : zoo.getCages()) {
      Point up = new Point((int) visitorLoc.getX(), (int) visitorLoc.getY() - 1);
      Point down = new Point((int) visitorLoc.getX(), (int) visitorLoc.getY() + 1);
      Point left = new Point((int) visitorLoc.getX() - 1, (int) visitorLoc.getY());
      Point right = new Point((int) visitorLoc.getX() + 1, (int) visitorLoc.getY());
      boolean isCageAdjacent = c.getArea().contains(up)
          || c.getArea().contains(down)
          || c.getArea().contains(left)
          || c.getArea().contains(right);

      if (isCageAdjacent) {
        System.out.println();
        for (Animal a : c.getAnimal()) {
          a.interact();
        }
      }
    }
  }

  /**
   * Menggerakan Visitor secara acak ke petak yang belum pernah dikunjungi.
   *
   * @return Apakah Visitor masih dapat bergerak.
   */
  private boolean moveVisitor() {
    boolean movementInRange;
    Point loc;
    int noOfTries = 0;

    int movement = ThreadLocalRandom.current().nextInt(0, 4);
    do {
      visitor.move(movement);
      loc = visitor.getPosition();
      movementInRange = (loc.y >= 0 && loc.y < zoo.getWidth()
          && loc.x >= 0 && loc.x < zoo.getLength());
      if (movementInRange) {
        movementInRange = !visited[loc.y][loc.x];
      }
      if (!movementInRange) {
        if (noOfTries < 4) {
          movement = (movement + 2) % 4;
          visitor.move(movement);
          movement = (movement + 3) % 4;
          noOfTries++;
        } else {
          return false;
        }
      } else {
        visited[loc.y][loc.x] = true;
      }
    } while (!movementInRange);
    return true;
  }

  /**
   * Menggerakan semua Animal di Cage secara acak.
   */
  private void moveAnimals() {
    for (Cage c : zoo.getCages()) {
      c.moveAnimal();
    }
  }
}

package virtualzoo.zoo;

import java.awt.Point;
import java.util.Scanner;
import virtualzoo.misc.Person;

/**
 * Kelas ZooDisplay menampilkan zoo saat ini.
 *
 * @author Felix Limanta - 13515065
 * @version 3.0
 * @since 3.0
 */
public class ZooDisplay {

  /**
   * Zoo yang akan ditampilkan.
   */
  private Zoo zoo;

  /**
   * Konstruktor.
   *
   * @param zoo Zoo yang akan ditampilkan.
   */
  public ZooDisplay(Zoo zoo) {
    this.zoo = zoo;
  }

  /**
   * Interface untuk menampilkan Zoo di layar.
   * Meminta batas titik kiri atas dan kanan bawah.
   * Mencetak Zoo yang berada di antara batas tersebut.
   */
  public void displayZoo() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    Scanner in = new Scanner(System.in);
    int[] coord = new int[4];
    System.out.print("Enter upper left coordinate (x y):\t");
    coord[0] = in.nextInt();
    coord[1] = in.nextInt();
    System.out.print("Enter lower right coordinate (x y):\t");
    coord[2] = in.nextInt();
    coord[3] = in.nextInt();
    Point upperLeft = new Point(coord[1], coord[0]);
    Point lowerRight = new Point(coord[3], coord[2]);
    System.out.println("Map:");
    zoo.renderMap(new Person());
    printMap(upperLeft, lowerRight);
    System.out.println("\nPress enter to continue");
    new Scanner(System.in).nextLine();
  }


  /**
   * Menampilkan hasil render zoo ke layar.
   *
   * @param upperLeft Point batas kiri atas.
   * @param lowerRight Point batas kanan bawah.
   */
  public void printMap(Point upperLeft, Point lowerRight) {
    for (int i = (int) upperLeft.getY(); i <= (int) lowerRight.getY(); ++i) {
      for (int j = (int) upperLeft.getX(); j <= (int) lowerRight.getX(); ++j) {
        System.out.print(zoo.getMapChar()[i][j]);
      }
      System.out.println();
    }
  }
}

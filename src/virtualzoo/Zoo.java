package virtualzoo;

import virtualzoo.animal.*;
import virtualzoo.infrastructure.*;
import virtualzoo.infrastructure.facility.*;
import virtualzoo.misc.Person;
import java.util.Set;
import java.util.Vector;
import java.awt.Point;
import java.lang.*;


/**
 * Kelas Zoo berisi elemen-elemen dari virtual zoo.
 *
 * @author Felix Limanta - 13515065
 * @version 3.0
 * @since   3.0
 */
public class Zoo {
  private static final int LENGTH = 20;
  private static final int WIDTH = 20;
  private Cell [][] map;
  private char map_char [][];
  private Vector<Cage> cages;
  private Set<Point> entrance;
  private Set<Point> exit;

  /**
   * Constructor
   * Mengalokasikan Zoo kosong dengan ukuran WIDTH x LENGTH.
   */
  public Zoo()  {
    map = new Cell[WIDTH][LENGTH];
    map_char = new char[WIDTH][LENGTH];
    for (int i = 0; i < WIDTH; ++i) {
      for (int j = 0; j < LENGTH; ++j) {
        map[i][j] = null;
        map_char[i][j] = ' ';
      }
    }
  }

  /**
   * Menetapkan jenis cell pada titik (i,j).
   * @param c Suatu cell yang telah diciptakan.
   * @param i Indeks matriks (absis).
   * @param j Indeks matriks (ordinat).
   */
  public void setTile(Cell c, int i, int j) {
    map[i][j] = c;
  }

  /**
   * Getter cell pada titik (i,j).
   * @param i Indeks matriks (absis).
   * @param j Indeks matriks (ordinat).
   * @return Cell pada titik (i,j).
   */
  public Cell getTile(int i, int j) {
    return map[i][j];
  }

  /**
   * @return Nilai map.
   */
  public Cell[][] getMap() {
    return map;
  }

  /**
   * @return Set berisi point lokasi entrance zoo.
   */
  public Set<Point> getEntrance() {
    return entrance;
  }

  /**
   * @return Set berisi point lokasi exit zoo.
   */
  public Set<Point> getExit(){
    return exit;
  }

  /**
   * @return Vector berisi point lokasi cage zoo.
   */
  public Vector<Cage> getCages(){
    return cages;
  }

  /**
   * Menambahkan cage baru dalam zoo.
   * @param c Cage yang sudah diciptakan.
   */
  public void addCage(Cage c) {
    cages.add(c);
  }

  /**
   * Menghilangkan cage pada indeks ke-i dari zoo.
   * @param i Indeks cage yang ingin dihilangkan.
   * @return Cage yang dihapus
   */
  public Cage removeCage(int i) {
    if (i >= 0 && i < cages.size()) {
      Cage c = cages.elementAt(i);
      cages.removeElementAt(i);
      return c;
    } else {
      return null;
    }
  }

  /**
   * Melakukan proses render untuk seisi zoo.
   * @param visitor Person yang merupakan pengunjung zoo.
   */
  public void renderMap(Person visitor) {
    for (int i = 0; i < WIDTH; ++i) {
      for (int j = 0; j < LENGTH; ++j) {
        map_char[i][j] = map[i][j].render();
      }
    }
    for (Cage cage: cages) {
      for (Point p: cage.getArea()) {
        map_char[(int) p.getY()][(int) p.getX()] =
            Character.toUpperCase(map_char[(int) p.getY()][(int) p.getX()]);
      }
      for (Animal a: cage.getAnimal()) {
        Point p = a.getPosition();
        map_char[(int) p.getY()][(int) p.getX()] = a.render();
      }
    }
    Point p = visitor.getPosition();
    if (p.getX() >= 0 && p.getX() < LENGTH &&
        p.getY() >= 0 && p.getY() < WIDTH) {
      map_char[(int) p.getY()][(int) p.getX()] = visitor.render();
    }
  }

  /**
   * Menampilkan hasil render zoo ke layar.
   * @param ux Nilai absis koordinat pojok kiri atas.
   * @param uy Nilai ordinat koordinat pojok kiri atas.
   * @param lx Nilai absis koordinat pojok kanan bawah.
   * @param ly NIlai ordinat koordinat pojok kanan bawah.
   */
  public void printMap(int ux, int uy, int lx, int ly) {
    for (int i = uy; i <= ly; ++i) {
      for (int j = ux; j <= lx; ++j) {
        System.out.print(map_char[i][j]);
      }
      System.out.println();
    }
  }

  /**
   * Mencari semua entrance dan exit dari zoo dan menyimpannya.
   */
  public void listAllEntranceExit() {
    for (int i = 0; i < WIDTH; ++i) {
      for (int j = 0; j < LENGTH; ++j) {
        if (map[i][j] instanceof Road) {
          Road r = (Road) map[i][j];
          if (r.isEntrance()) {
            entrance.add(new Point(j,i));
          } else if (r.isExit()) {
            exit.add(new Point(j,i));
          }
        }
      }
    }
  }
}

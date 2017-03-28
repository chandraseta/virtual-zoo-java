package virtualzoo.zoo;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import virtualzoo.animal.Animal;
import virtualzoo.infrastructure.Cell;
import virtualzoo.infrastructure.facility.Road;
import virtualzoo.misc.Person;

/**
 * Kelas Zoo berisi elemen-elemen dari virtual zoo.
 *
 * @author Felix Limanta - 13515065
 * @version 3.0
 * @since   3.0
 */
public class Zoo {
  /**
   * Konstanta panjang taman default
   */
  public static final int DEF_LENGTH = 20;

  /**
   * Konstanta lebar taman default
   */
  public static final int DEF_WIDTH = 20;

  /**
   * Matriks yang berisi setiap Cell yang membentuk Zoo
   */
  private Cell map[][];

  /**
   * Matriks char yang merepresentasikan Cell yang ada di Zoo
   */
  private char mapChar[][];

  /**
   * Panjang Zoo
   */
  private int length;

  /**
   * Lebar Zoo
   */
  private int width;

  /**
   * Berisi Cage yang ada di Zoo
   */
  private Vector<Cage> cages = new Vector<Cage>();

  /**
   * Berisi Point yang dapat menjadi pintu masuk Zoo
   */
  private Set<Point> entrance = new HashSet<Point>();

  /**
   * Berisi Point yang dapat menjadi pintu keluar Zoo
   */
  private Set<Point> exit = new HashSet<Point>();

  /**
   * Constructor
   * Mengalokasikan Zoo kosong dengan ukuran DEF_WIDTH x DEF_LENGTH.
   */
  public Zoo()  {
    this.length = DEF_LENGTH;
    this.width = DEF_WIDTH;
    map = new Cell[DEF_WIDTH][DEF_LENGTH];
    mapChar = new char[DEF_WIDTH][DEF_LENGTH];
    for (int i = 0; i < DEF_WIDTH; ++i) {
      for (int j = 0; j < DEF_LENGTH; ++j) {
        map[i][j] = null;
        mapChar[i][j] = ' ';
      }
    }
  }

  /**
   * Constructor
   * Mengalokasikan Zoo kosong dengan ukuran width x length
   * @param length Panjang zoo
   * @param width Lebar zoo
   */
  public Zoo(int length, int width) {
    this.length = length;
    this.width = width;
    map = new Cell[width][length];
    mapChar = new char[width][length];
    for (int i = 0; i < width; ++i) {
      for (int j = 0; j < length; ++j) {
        map[i][j] = null;
        mapChar[i][j] = ' ';
      }
    }
  }

  /**
   * Getter panjang dari zoo
   * @return zoo.length
   */
  public int getLength() {
    return length;
  }

  /**
   * Getter lebar dari zoo
   * @return zoo.width
   */
  public int getWidth() {
    return width;
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
   * Menetapkan jenis cell pada titik (i,j).
   * @param c Suatu cell yang telah diciptakan.
   * @param i Indeks matriks (absis).
   * @param j Indeks matriks (ordinat).
   */
  public void setTile(Cell c, int i, int j) {
    map[i][j] = c;
  }

  /**
   * @return Nilai map.
   */
  public Cell[][] getMap() {
    return map;
  }

  /**
   * @return Matriks char dari map zoo
   */
  public char[][] getMapChar() { return mapChar; }

  /**
   * @return Set berisi point lokasi entrance zoo.
   */
  public Set<Point> getEntrance() {
    return entrance;
  }

  /**
   * @return Set berisi point lokasi exit zoo.
   */
  public Set<Point> getExit() {
    return exit;
  }

  /**
   * @return Vector berisi point lokasi cage zoo.
   */
  public Vector<Cage> getCages() {
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
    for (int i = 0; i < width; ++i) {
      for (int j = 0; j < length; ++j) {
        mapChar[i][j] = map[i][j].render();
      }
    }
    for (Cage cage: cages) {
      for (Point p: cage.getArea()) {
        mapChar[(int) p.getY()][(int) p.getX()] =
            Character.toUpperCase(mapChar[(int) p.getY()][(int) p.getX()]);
      }
      for (Animal a: cage.getAnimal()) {
        Point p = a.getPosition();
        mapChar[(int) p.getY()][(int) p.getX()] = a.render();
      }
    }
    Point p = visitor.getPosition();
    if (p.getX() >= 0 && p.getX() < length &&
        p.getY() >= 0 && p.getY() < width) {
      mapChar[(int) p.getY()][(int) p.getX()] = visitor.render();
    }
  }

  /**
   * Mencari semua entrance dan exit dari zoo dan menyimpannya.
   */
  public void listAllEntranceExit() {
    for (int i = 0; i < DEF_WIDTH; ++i) {
      for (int j = 0; j < DEF_LENGTH; ++j) {
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

package virtualzoo.zoo;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;
import virtualzoo.animal.Animal;
import virtualzoo.animal.behavior.AnimalBehavior;
import virtualzoo.animal.behavior.BehaviorWild;

/**
 * Kelas Cage yang memiliki area dan berisi animal.
 *
 * @author Felix Limanta - 13515065
 * @version 3.0
 * @since 3.0
 */
public class Cage {

  /**
   * Konstanta untuk mempermudah pernyataan tipe LAND pada Cage
   */
  public static final int LAND = 0;

  /**
   * Konstanta untuk mempermudah pernyataan tipe WATER pada Cage
   */
  public static final int WATER = 1;

  /**
   * Konstanta untuk mempermudah pernyataan tipe AIR pada Cage
   */
  public static final int AIR = 2;

  /**
   * Atribut yang menandakan tipe Cage
   */
  private int type;

  /**
   * Berisi kumpulan Point yang membentuk Cage ini
   */
  private Set<Point> area;

  /**
   * Berisi Animal yang ada di Cage ini
   */
  private Vector<Animal> animal;

  /**
   * Jumlah Animal yang ada di Cage ini
   */
  private int nbAnimal;

  /**
   * Constructor
   * Menciptakan cage default yaitu dengan habitat darat.
   */
  public Cage() {
    type = LAND;
    nbAnimal = 0;
    area = new HashSet<Point>();
    animal = new Vector<Animal>();
  }

  /**
   * Constructor
   * Menciptakan cage dengan habitat tertentu.
   *
   * @param habitatType tipe habitat
   */
  public Cage(int habitatType) {
    type = habitatType;
    nbAnimal = 0;
    area = new HashSet<Point>();
    animal = new Vector<Animal>();
  }

  /**
   * Menambahkan point P menjadi area dalam cage.
   *
   * @param p Nilai point yang akan ditambahkan.
   */
  public void addPoint(Point p) {
    area.add(p);
  }

  /**
   * Menghilangkan point P dari area dalam cage.
   *
   * @param p Nilai point yang akan dihilangkan.
   */
  public void removePoint(Point p) {
    area.remove(p);
  }

  /**
   * Menambahkan animal ke dalam cage.
   * Akan dicek terlebih dahulu apakah cage sudah penuh.
   *
   * @param a Hewan yang ingin ditambahkan.
   */
  public void addAnimal(Animal a) {
    if (nbAnimal < area.size() / 10 * 3) {
      AnimalBehavior behavior = a.getAnimalBehavior();

      if (!behavior.getBehavior()) {
        animal.add(a);
        nbAnimal++;
      } else {
        boolean placeable = true;
        BehaviorWild wild = (BehaviorWild) behavior;
        for (int i = 0; i < animal.size() && placeable; ++i) {
          placeable = wild.isEnemy(animal.elementAt(i).getId());
        }
        if (placeable) {
          animal.add(a);
          nbAnimal++;
        }
      }
    }
  }

  /**
   * @param i Indeks animal yang ingin dikurangi.
   * @return Hewan yang telah dihilangkan.
   */
  public Animal removeAnimal(int i) {
    if (i < animal.size()) {
      Animal a = animal.elementAt(i);
      animal.remove(i);
      nbAnimal--;
      return a;
    } else {
      return null;
    }
  }

  /**
   * Menggerakkan semua animal di dalam cage.
   * Akan dicek agar animal tidak keluar dari cage.
   */
  public void moveAnimal() {
    for (int i = 0; i < animal.size(); ++i) {
      int movement = ThreadLocalRandom.current().nextInt(0,4);
      boolean movementInCage;
      int noOfTries = 0;
      do {
        animal.elementAt(i).move(movement);
        movementInCage = area.contains(animal.elementAt(i).getPosition());
        if (!movementInCage) {
          movement = (movement + 2) % 4;
          animal.elementAt(i).move(movement);
          movement = (movement + 3) % 4;
          noOfTries++;
        }
      } while (!movementInCage && noOfTries < 4);
    }
  }

  /**
   * Getter area cage.
   * @return Set of point yang menyatakan area cage.
   */
  public Set<Point> getArea() {
    return area;
  }

  /**
   * Getter daftar animal.
   * @return Vector of pointer to Animal yang berisi hewan.
   */
  public Vector<Animal> getAnimal() {
    return animal;
  }
}

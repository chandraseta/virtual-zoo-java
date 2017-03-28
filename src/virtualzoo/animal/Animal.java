package virtualzoo.animal;

import java.awt.Point;
import virtualzoo.animal.behavior.AnimalBehavior;
import virtualzoo.animal.diet.AnimalDiet;
import virtualzoo.misc.Renderable;

/**
 * Kelas Animal merupakan superclass untuk semua jenis hewan
 * yang ada di dalam Zoo.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public abstract class Animal implements Renderable {

  /**
   * ID unik untuk setiap jenis Animal.
   */
  protected int id;
  /**
   * Banyaknya alat gerak yang dimiliki Animal.
   */
  protected int limbCount;
  /**
   * Jenis kulit yang dimiliki Animal.
   */
  protected String skinType;
  /**
   * Atribut yang menentukan apakah Animal dapat hidup di habitat darat.
   */
  protected boolean isLandAnimal;
  /**
   * Atribut yang menentukan apakah Animal dapat hidup di habitat air.
   */
  protected boolean isWaterAnimal;
  /**
   * Atribut yang menentukan apakah Animal dpaat hidup di habitat udara.
   */
  protected boolean isAirAnimal;
  /**
   * Sebuah point yang menyatakan lokasi dari Animal.
   */
  protected Point position = new Point(-1,-1);
  /**
   * Atribut yang menentukan kelakuan Animal.
   */
  protected AnimalBehavior animalBehavior;
  /**
   * Atribut yang menentukan klasifikasi makanan hewan.
   */
  protected AnimalDiet animalDiet;

  /**
   * Mengembalikan ID Animal.
   *
   * @return Nilai ID.
   */
  public int getId() {
    return id;
  }

  /**
   * Mengontrol interaksi Animal.
   * Setiap jenis Animal memiliki interaksi berbeda.
   */
  public abstract void interact();

  /**
   * Menggerakkan Animal dengan mengubah position-nya.
   *
   * @param movement Sebuah nilai yang menentukan arah gerak Animal.
   */
  public void move(int movement) {
    if (movement == 1) {
      position.setLocation(position.getX(), position.getY() - 1);
    } else if (movement == 2) {
      position.setLocation(position.getX() + 1, position.getY());
    } else if (movement == 3) {
      position.setLocation(position.getX(), position.getY() + 1);
    } else {
      position.setLocation(position.getX() - 1, position.getY());
    }
  }

  /**
   * Menentukan apakah Animal dapat hidup di habitat darat.
   *
   * @return Nilai is_land_animal.
   */
  public boolean getLandAnimal() {
    return isLandAnimal;
  }

  /**
   * Menentukan apakah Animal dapat hidup di habitat air.
   *
   * @return Nilai is_water_animal.
   */
  public boolean getWaterAnimal() {
    return isWaterAnimal;
  }

  /**
   * Menentukan apakah Animal dapat hidup di habitat udara.
   *
   * @return Nilai is_air_animal.
   */
  public boolean getAirAnimal() {
    return isAirAnimal;
  }

  /**
   * Mengembalikan sebuah Point yang berisi posisi Animal.
   *
   * @return Nilai position.
   */
  public Point getPosition() {
    return position;
  }

  /**
   * Mengembalikan kelakuan Animal.
   *
   * @return Nilai animal_behavior.
   */
  public AnimalBehavior getAnimalBehavior() {
    return animalBehavior;
  }

  /**
   * Mengembalikan klasifikasi makanan Animal.
   *
   * @return Nilai animal_diet.
   */
  public AnimalDiet getAnimalDiet() {
    return animalDiet;
  }

  /**
   * Mengembalikan sebuah karakter untuk proses render.
   *
   * @return Sebuah char yang menandakan Animal.
   */
  public char render() {
    return 'O';
  }
}
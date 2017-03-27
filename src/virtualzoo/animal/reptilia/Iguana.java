package virtualzoo.animal.reptilia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Omnivora;

/**
 * Kelas Iguana mendefinisikan atribut untuk iguana.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class Iguana extends Reptilia {

  /**
   * Constructor
   *
   * Menciptakan iguana dengan posisi (_x,_y) dan berat _weight.
   *
   * @param _x Nilai absis posisi.
   * @param _y Nilai ordinat posisi.
   * @param _weight Nilai berat iguana.
   */
  public Iguana(int _x, int _y, int _weight) {
    super();
    animal_behavior = new BehaviorTame();
    animal_diet = new Omnivora(_weight, 20, 40);
    ID = 11;
    position.setLocation(_x, _y);
    is_land_animal = true;
    is_water_animal = false;
    is_air_animal = false;
  }

  /**
   * Mengatur interaksi dengan iguana
   */
  public void interact() {
    System.out.println("The iguana is calmly sleeping on a tree.");
  }
}

package virtualzoo.animal.pisces;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Omnivora;

/**
 * Kelas Clownfish mendefinisikan atribut untuk clownfish.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class Clownfish extends Pisces {

  /**
   * Constructor
   *
   * Menciptakan clownfish dengan posisi (_x,_y) dan berat _weight.
   *
   * @param _x Nilai absis posisi.
   * @param _y Nilai ordinat posisi.
   * @param _weight Nilai berat clownfish.
   */
  public Clownfish(int _x, int _y, int _weight) {
    super();
    animal_behavior = new BehaviorTame();
    animal_diet = new Omnivora(_weight, 30, 40);
    ID = 14;
    position.setLocation(_x, _y);
    is_land_animal = false;
    is_water_animal = true;
    is_air_animal = false;
  }

  /**
   * Mengatur interaksi dengan clownfish.
   */
  public void interact() {
    System.out.println("The clownfish is not as funny as its name...");
  }
}

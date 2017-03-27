package virtualzoo.animal.aves;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Omnivora;

/**
 * Kelas Peacock mendefinisikan atribut untuk peacock.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class Peacock extends Aves {

  /**
   * Constructor
   *
   * Menciptakan colibri dengan posisi (_x,_y) dan berat _weight.
   *
   * @param _x Nilai absis posisi.
   * @param _y Nilai ordinat posisi.
   * @param _weight Nilai berat peacock.
   */
  public Peacock(int _x, int _y, int _weight) {
    super();
    animal_behavior = new BehaviorTame();
    animal_diet = new Omnivora(_weight, 20, 40);
    ID = 19;
    position.setLocation(_x, _y);
    is_land_animal = true;
    is_water_animal = false;
    is_air_animal = false;
  }

  /**
   * Mengatur interaksi peacock.
   */
  public void interact() {
    System.out.println("The peacock is showing off its beautiful feather");
  }
}
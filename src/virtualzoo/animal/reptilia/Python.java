package virtualzoo.animal.reptilia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Carnivora;

/**
 * Kelas Python mendefinisikan atribut untuk python.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class Python extends Reptilia {

  /**
   * Constructor
   *
   * Menciptakan python dengan posisi (_x,_y) dan berat _weight.
   *
   * @param _x Nilai absis posisi.
   * @param _y Nilai ordinat posisi.
   * @param _weight Nilai berat python.
   */
  public Python(int _x, int _y, int _weight) {
    super();
    limb_count = 0;
    animal_behavior = new BehaviorTame();
    animal_diet = new Carnivora(_weight, 40);
    ID = 9;
    position.setLocation(_x, _y);
    is_land_animal = true;
    is_water_animal = false;
    is_air_animal = false;
  }

  /**
   * Mengatur interaksi dengan python.
   */
  public void interact() {
    System.out.println("The python is slithering across the ground");
  }
}

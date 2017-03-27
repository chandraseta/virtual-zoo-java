package virtualzoo.animal.reptilia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Omnivora;

/**
 * Kelas Chameleon mendefinisikan atribut untuk chameleon.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class Chameleon extends Reptilia {

  /**
   * Constructor
   *
   * Menciptakan chameleon dengan posisi (_x,_y) dan berat _weight.
   *
   * @param _x Nilai absis posisi.
   * @param _y Nilai ordinat posisi.
   * @param _weight Nilai berat chameleon.
   */
  public Chameleon(int _x, int _y, int _weight) {
    super();
    animal_behavior = new BehaviorTame();
    animal_diet = new Omnivora(_weight, 20, 50);
    ID = 12;
    position.setLocation(_x, _y);
    is_land_animal = true;
    is_water_animal = false;
    is_air_animal = false;
  }

  /**
   * Mengatur interaksi dengan chameleon
   */
  public void interact() {
    System.out.println("The chameleon can be barely seen");
  }
}

package virtualzoo.animal.mammalia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Herbivora;

/**
 * Kelas Giraffe mendefinisikan atribut untuk giraffe.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class Giraffe extends Mammalia {

  /**
   * Constructor
   *
   * Menciptakan giraffe dengan posisi (_x,_y) dan berat _weight.
   *
   * @param _x _x Nilai absis posisi.
   * @param _y _y Nilai ordinat posisi.
   * @param _weight Nilai berat giraffe.
   */
  public Giraffe(int _x, int _y, int _weight) {
    super();
    animal_behavior = new BehaviorTame();
    animal_diet = new Herbivora(_weight, 60);
    ID = 6;
    position.setLocation(_x, _y);
    is_land_animal = true;
    is_water_animal = false;
    is_air_animal = false;
  }

  /**
   * Mengatur interaksi dengan giraffe.
   */
  public void interact() {
    System.out.println("The giraffe is looking down to you, literally");
  }
}

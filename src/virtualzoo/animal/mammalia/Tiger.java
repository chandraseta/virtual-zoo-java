package virtualzoo.animal.mammalia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Carnivora;

/**
 * Kelas Tiger mendefinisikan atribut untuk tiger.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class Tiger extends Mammalia {

  /**
   * Constructor
   *
   * Menciptakan tiger dengan posisi (_x,_y) dan berat _weight.
   *
   * @param _x Nilai absis posisi.
   * @param _y Nilai ordinat posisi.
   * @param _weight Nilai berat tiger.
   */
  public Tiger(int _x, int _y, int _weight) {
    super();
    animal_behavior = new BehaviorTame();
    animal_diet = new Carnivora(_weight, 50);
    ID = 3;
    position.setLocation(_x, _y);
    is_land_animal = true;
    is_water_animal = false;
    is_air_animal = false;
  }

  /**
   * Mengatur interaksi dengan tiger.
   */
  public void interact() {
    System.out.println("The tiger is graciously lying on the grass");
  }
}

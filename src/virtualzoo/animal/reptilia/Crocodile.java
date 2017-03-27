package virtualzoo.animal.reptilia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Carnivora;

/**
 * Kelas Crocodile mendefinisikan atribut untuk crocodile.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class Crocodile extends Reptilia {

  /**
   * Constructor
   *
   * Menciptakan crocodile dengan posisi (_x,_y) dan berat _weight.
   *
   * @param _x Nilai absis posisi.
   * @param _y Nilai ordinat posisi.
   * @param _weight Nilai berat crocodile.
   */
  public Crocodile(int _x, int _y, int _weight) {
    super();
    animal_behavior = new BehaviorTame();
    animal_diet = new Carnivora(_weight, 60);
    ID = 8;
    position.setLocation(_x, _y);
    is_land_animal = true;
    is_water_animal = true;
    is_air_animal = false;
  }

  /**
   * Mengatur interaksi dengan crocodile
   */
  public void interact() {
    System.out.println("The crocodile is laying still on a slab of rock");
  }
}

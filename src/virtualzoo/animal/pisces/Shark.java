package virtualzoo.animal.pisces;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Carnivora;

/**
 * Kelas Shark mendefinisikan atribut untuk shark.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class Shark extends Pisces {

  /**
   * Constructor
   *
   * Menciptakan barracuda dengan posisi (_x,_y) dan berat _weight.
   *
   * @param _x Nilai absis posisi.
   * @param _y Nilai ordinat posisi.
   * @param _weight Nilai berat barracuda.
   */
  public Shark(int _x, int _y, int _weight) {
    super();
    animal_behavior = new BehaviorTame();
    animal_diet = new Carnivora(_weight, 70);
    ID = 13;
    position.setLocation(_x, _y);
    is_land_animal = false;
    is_water_animal = true;
    is_air_animal = false;
  }

  /**
   * Mengatur interaksi dengan shark.
   */
  public void interact() {
    System.out.println("The shark is staring at you menacingly");
  }
}

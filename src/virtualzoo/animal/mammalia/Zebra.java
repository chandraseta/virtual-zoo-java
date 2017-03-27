package virtualzoo.animal.mammalia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Herbivora;

/**
 * Created by Rionaldi Chandraset on 27/03/2017.
 */
public class Zebra extends Mammalia {

  /**
   * Constructor
   *
   * Menciptakan elephant dengan posisi (_x,_y) dan berat _weight.
   *
   * @param _x Nilai absis posisi.
   * @param _y Nilai ordinat posisi.
   * @param _weight Nilai berat zebra.
   */
  public Zebra(int _x, int _y, int _weight) {
    super();
    animal_behavior = new BehaviorTame();
    animal_diet = new Herbivora(_weight, 45);
    ID = 4;
    position.setLocation(_x, _y);
    is_land_animal = true;
    is_water_animal = false;
    is_air_animal = false;
  }

  /**
   * Mengatur interaksi dengan zera.
   */
  public void interact() {
    System.out.println("The zebra is running at the grass field");
  }
}

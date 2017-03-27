package virtualzoo.animal.aves;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Carnivora;

/**
 * Kelas Eagle mendefinisikan atribut untuk eagle.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class Eagle extends Aves {

  /**
   * Constructor
   *
   * Menciptakan eagle dengan posisi (_x,_y) dan berat _weight.
   *
   * @param _x Nilai absis posisi.
   * @param _y Nilai ordinat posisi.
   * @param _weight Nilai berat eagle.
   */
  public Eagle(int _x, int _y, int _weight) {
    super();
    animal_behavior = new BehaviorTame();
    animal_diet = new Carnivora(_weight, 60);
    ID = 17;
    position.setLocation(_x, _y);
    is_land_animal = true;
    is_water_animal = false;
    is_air_animal = true;
  }

  /**
   * Mengatur interaksi eagle.
   */
  public void interact() {
    System.out.println("The eagle is roosting majestically on a tree");
  }
}
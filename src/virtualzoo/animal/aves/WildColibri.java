package virtualzoo.animal.aves;

import virtualzoo.animal.Animal;
import virtualzoo.animal.behavior.BehaviorWild;
import virtualzoo.animal.diet.Herbivora;

/**
 * Kelas WildColibri mendefinisikan atribut untuk wild colibri.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class WildColibri extends Aves {

  /**
   * Constructor
   *
   * Menciptakan wild colibri dengan posisi (_x, _y) dan berat _weight.
   *
   * @param _x Nilai absis posisi.
   * @param _y Nilai ordinat posisi.
   * @param _weight Nilai berat wild colibri.
   */
  public WildColibri(int _x, int _y, int _weight) {
    super();
    animal_behavior = new BehaviorWild();
    animal_diet = new Herbivora(_weight, 60);
    ID = 21;
    position.setLocation(_x, _y);
    is_land_animal = true;
    is_water_animal = false;
    is_air_animal = true;
    animal_behavior.addEnemy(2);
    animal_behavior.addEnemy(3);
    animal_behavior.addEnemy(9);
    animal_behavior.addEnemy(19);
  }

  /**
   * Mengatur interaksi dengan wild colibri.
   */
  public void interact() {
    System.out.println("The wild colibri is going to skewer your eyes");
  }
}

package virtualzoo.animal.aves;

import virtualzoo.animal.behavior.BehaviorWild;
import virtualzoo.animal.diet.Herbivora;

/** <p>
 * Kelas WildColibri mendefinisikan atribut untuk wild colibri.
 * </p>
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class WildColibri extends Aves {

  /** <p>
   * Constructor
   *
   * Menciptakan wild colibri dengan posisi (locX, locY) dan berat animalWeight.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat wild colibri.
   */
  public WildColibri(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorWild();
    animalDiet = new Herbivora(animalWeight, 60);
    id = 21;
    position.setLocation(locX, locY);
    isLandAnimal = true;
    isWaterAnimal = false;
    isAirAnimal = true;
    animalBehavior.addEnemy(2);
    animalBehavior.addEnemy(3);
    animalBehavior.addEnemy(9);
    animalBehavior.addEnemy(19);
  }

  /** <p>
   * Mengatur interaksi dengan wild colibri.
   * </p>
   */
  public void interact() {
    System.out.println("The wild colibri is going to skewer your eyes");
  }
}

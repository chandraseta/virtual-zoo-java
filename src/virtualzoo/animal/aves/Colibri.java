package virtualzoo.animal.aves;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Herbivora;

/** <p>
 * Kelas Colibri mendefinisikan atribut untuk colibri.
 * </p>
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class Colibri extends Aves {

  /** <p>
   * Constructor
   *
   * Menciptakan colibri dengan posisi (locX,locY) dan berat animalWeight.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat colibri.
   */
  public Colibri(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorTame();
    animalDiet = new Herbivora(animalWeight, 60);
    id = 18;
    position.setLocation(locX, locY);
    isLandAnimal = true;
    isWaterAnimal = false;
    isAirAnimal = true;
  }

  /** <p>
   * Mengatur interaksi colibri.
   * </p>
   */
  public void interact() {
    System.out.println("The colibri is looking at you, apparently"
        + "confused");
  }
}
package virtualzoo.animal.aves;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Carnivora;

/** <p>
 * Kelas Eagle mendefinisikan atribut untuk eagle.
 * </p>
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class Eagle extends Aves {

  /** <p>
   * Constructor
   *
   * Menciptakan eagle dengan posisi (locX,locY) dan berat animalWeight.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat eagle.
   */
  public Eagle(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorTame();
    animalDiet = new Carnivora(animalWeight, 60);
    id = 17;
    position.setLocation(locX, locY);
    isLandAnimal = true;
    isWaterAnimal = false;
    isAirAnimal = true;
  }

  /** <p>
   * Mengatur interaksi eagle.
   * </p>
   */
  public void interact() {
    System.out.println("The eagle is roosting majestically on a tree");
  }
}
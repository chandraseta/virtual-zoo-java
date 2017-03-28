package virtualzoo.animal.aves;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Herbivora;

/**
 * Kelas Colibri mendefinisikan atribut untuk colibri.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class Colibri extends Aves {

  /**
   * Constructor
   *
   * Menciptakan colibri dengan posisi (locX,locY) dan berat animalWeight.
   *
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat colibri.
   */
  public Colibri(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorTame();
    animalDiet = new Herbivora(animalWeight, 60);
    ID = 18;
    position.setLocation(locX, locY);
    isLandAnimal = true;
    isWaterAnimal = false;
    isAirAnimal = true;
  }

  /**
   * Mengatur interaksi colibri.
   */
  public void interact() {
    System.out.println("The colibri is looking at you, apparently" +
        "confused");
  }
}
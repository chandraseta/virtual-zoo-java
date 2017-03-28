package virtualzoo.animal.aves;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Omnivora;

/**
 * Kelas Peacock mendefinisikan atribut untuk peacock.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class Peacock extends Aves {

  /**
   * Constructor
   *
   * Menciptakan peacock dengan posisi (locX,locY) dan berat animalWeight.
   *
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat peacock.
   */
  public Peacock(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorTame();
    animalDiet = new Omnivora(animalWeight, 20, 40);
    ID = 19;
    position.setLocation(locX, locY);
    isLandAnimal = true;
    isWaterAnimal = false;
    isAirAnimal = false;
  }

  /**
   * Mengatur interaksi peacock.
   */
  public void interact() {
    System.out.println("The peacock is showing off its beautiful feather");
  }
}
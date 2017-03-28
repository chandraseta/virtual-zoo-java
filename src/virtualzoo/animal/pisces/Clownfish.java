package virtualzoo.animal.pisces;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Omnivora;

/**
 * Kelas Clownfish mendefinisikan atribut untuk clownfish.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class Clownfish extends Pisces {

  /**
   * Constructor
   *
   * Menciptakan clownfish dengan posisi (locX,locY) dan berat animalWeight.
   *
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat clownfish.
   */
  public Clownfish(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorTame();
    animalDiet = new Omnivora(animalWeight, 30, 40);
    ID = 14;
    position.setLocation(locX, locY);
    isLandAnimal = false;
    isWaterAnimal = true;
    isAirAnimal = false;
  }

  /**
   * Mengatur interaksi dengan clownfish.
   */
  public void interact() {
    System.out.println("The clownfish is not as funny as its name...");
  }
}

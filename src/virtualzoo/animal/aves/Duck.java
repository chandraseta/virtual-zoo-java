package virtualzoo.animal.aves;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Omnivora;

/**
 * Kelas Duck mendefinisikan atribut untuk duck.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class Duck extends Aves {

  /**
   * Constructor
   *
   * Menciptakan duck dengan posisi (locX,locY) dan berat animalWeight.
   *
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat duck.
   */
  public Duck(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorTame();
    animalDiet = new Omnivora(animalWeight, 60, 60);
    ID = 20;
    position.setLocation(locX, locY);
    isLandAnimal = true;
    isWaterAnimal = true;
    isAirAnimal = true;
  }

  /**
   * Mengatur interaksi duck.
   */
  public void interact() {
    System.out.println("The duck just quacked loudly");
  }
}
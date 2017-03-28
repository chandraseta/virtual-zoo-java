package virtualzoo.animal.reptilia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Carnivora;

/**
 * Kelas Python mendefinisikan atribut untuk python.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class Python extends Reptilia {

  /**
   * Constructor
   *
   * Menciptakan python dengan posisi (locX,locY) dan berat animalWeight.
   *
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat python.
   */
  public Python(int locX, int locY, int animalWeight) {
    super();
    limb_count = 0;
    animalBehavior = new BehaviorTame();
    animalDiet = new Carnivora(animalWeight, 40);
    ID = 9;
    position.setLocation(locX, locY);
    isLandAnimal = true;
    isWaterAnimal = false;
    isAirAnimal = false;
  }

  /**
   * Mengatur interaksi dengan python.
   */
  public void interact() {
    System.out.println("The python is slithering across the ground");
  }
}

package virtualzoo.animal.reptilia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Carnivora;

/**
 * Kelas Crocodile mendefinisikan atribut untuk crocodile.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class Crocodile extends Reptilia {

  /** <p>
   * Constructor
   *
   * Menciptakan crocodile dengan posisi (locX,locY) dan berat animalWeight.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat crocodile.
   */
  public Crocodile(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorTame();
    animalDiet = new Carnivora(animalWeight, 60);
    id = 8;
    position.setLocation(locX, locY);
    isLandAnimal = true;
    isWaterAnimal = true;
    isAirAnimal = false;
  }

  /**
   * Mengatur interaksi dengan crocodile.
   */
  public void interact() {
    System.out.println("The crocodile is laying still on a slab of rock");
  }
}

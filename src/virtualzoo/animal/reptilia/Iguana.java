package virtualzoo.animal.reptilia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Omnivora;

/**
 * Kelas Iguana mendefinisikan atribut untuk iguana.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class Iguana extends Reptilia {

  /** <p>
   * Constructor
   *
   * Menciptakan iguana dengan posisi (locX,locY) dan berat animalWeight.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat iguana.
   */
  public Iguana(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorTame();
    animalDiet = new Omnivora(animalWeight, 20, 40);
    id = 11;
    position.setLocation(locX, locY);
    isLandAnimal = true;
    isWaterAnimal = false;
    isAirAnimal = false;
  }

  /**
   * Mengatur interaksi dengan iguana.
   */
  public void interact() {
    System.out.println("The iguana is calmly sleeping on a tree.");
  }
}

package virtualzoo.animal.mammalia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Omnivora;

/**
 * Kelas Monkey mendefinisikan atribut untuk monkey.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class Monkey extends Mammalia {

  /** <p>
   * Constructor
   *
   * Menciptakan monkey dengan posisi (locX,locY) dan berat animalWeight.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat monkey.
   */
  public Monkey(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorTame();
    animalDiet = new Omnivora(animalWeight, 10, 40);
    id = 5;
    position.setLocation(locX, locY);
    isLandAnimal = true;
    isWaterAnimal = false;
    isAirAnimal = false;
  }

  /**
   * Mengatur interaksi dengan monkey.
   */
  public void interact() {
    System.out.println("The monkey is peeling a banana");
  }
}
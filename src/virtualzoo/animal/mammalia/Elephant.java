package virtualzoo.animal.mammalia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Herbivora;

/**
 * Kelas Elephant mendefinisikan atribut untuk elephant.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class Elephant extends Mammalia {

  /**
   * Constructor
   *
   * Menciptakan elephant dengan posisi (locX,locY) dan berat animalWeight.
   *
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat elephant.
   */
  public Elephant(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorTame();
    animalDiet = new Herbivora(animalWeight, 80);
    ID = 7;
    position.setLocation(locX, locY);
    isLandAnimal = true;
    isWaterAnimal = false;
    isAirAnimal = false;
  }

  /**
   * Mengatur interaksi dengan elephant.
   */
  public void interact() {
    System.out.println("The elephant is playing with its own trunk");
  }
}

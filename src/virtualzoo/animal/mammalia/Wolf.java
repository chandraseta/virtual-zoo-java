package virtualzoo.animal.mammalia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Carnivora;

/**
 * Kelas Wolf mendefinisikan atribut untuk wolf.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class Wolf extends Mammalia {

  /** <p>
   * Constructor
   *
   * Menciptakan wolf dengan posisi (locX,locY) dan berat animalWeight.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat elephant.
   */
  public Wolf(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorTame();
    animalDiet = new Carnivora(animalWeight, 50);
    id = 1;
    position.setLocation(locX, locY);
    isLandAnimal = true;
    isWaterAnimal = false;
    isAirAnimal = false;
  }

  /**
   * Mengatur interaksi dengan wolf.
   */
  public void interact() {
    System.out.println("The wolf is howling");
  }
}

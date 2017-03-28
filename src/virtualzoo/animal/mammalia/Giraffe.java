package virtualzoo.animal.mammalia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Herbivora;

/**
 * Kelas Giraffe mendefinisikan atribut untuk giraffe.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class Giraffe extends Mammalia {

  /** <p>
   * Constructor
   *
   * Menciptakan giraffe dengan posisi (locX,locY) dan berat animalWeight.
   * </p>
   * @param locX locX Nilai absis posisi.
   * @param locY locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat giraffe.
   */
  public Giraffe(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorTame();
    animalDiet = new Herbivora(animalWeight, 60);
    id = 6;
    position.setLocation(locX, locY);
    isLandAnimal = true;
    isWaterAnimal = false;
    isAirAnimal = false;
  }

  /**
   * Mengatur interaksi dengan giraffe.
   */
  public void interact() {
    System.out.println("The giraffe is looking down to you, literally");
  }
}

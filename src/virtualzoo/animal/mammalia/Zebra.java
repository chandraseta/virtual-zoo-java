package virtualzoo.animal.mammalia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Herbivora;

/**
 * Kelas Zebra mendefinisikan atribut untuk zebra.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class Zebra extends Mammalia {

  /** <p>
   * Constructor
   *
   * Menciptakan zebra dengan posisi (locX,locY) dan berat animalWeight.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat zebra.
   */
  public Zebra(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorTame();
    animalDiet = new Herbivora(animalWeight, 45);
    id = 4;
    position.setLocation(locX, locY);
    isLandAnimal = true;
    isWaterAnimal = false;
    isAirAnimal = false;
  }

  /**
   * Mengatur interaksi dengan zera.
   */
  public void interact() {
    System.out.println("The zebra is running at the grass field");
  }
}

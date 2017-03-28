package virtualzoo.animal.mammalia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Carnivora;

/**
 * Kelas Tiger mendefinisikan atribut untuk tiger.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class Tiger extends Mammalia {

  /**
   * Constructor
   *
   * Menciptakan tiger dengan posisi (locX,locY) dan berat animalWeight.
   *
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat tiger.
   */
  public Tiger(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorTame();
    animalDiet = new Carnivora(animalWeight, 50);
    ID = 3;
    position.setLocation(locX, locY);
    isLandAnimal = true;
    isWaterAnimal = false;
    isAirAnimal = false;
  }

  /**
   * Mengatur interaksi dengan tiger.
   */
  public void interact() {
    System.out.println("The tiger is graciously lying on the grass");
  }
}

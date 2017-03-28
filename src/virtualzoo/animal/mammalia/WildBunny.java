package virtualzoo.animal.mammalia;

import virtualzoo.animal.behavior.BehaviorWild;
import virtualzoo.animal.diet.Carnivora;

/**
 * Kelas WildBunny mendefinisikan atribut untuk wild bunny.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class WildBunny extends Mammalia {

  /** <p>
   * Constructor
   *
   * Menciptakan wild bunny dengan posisi (locX, locY) dan berat animalWeight.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat wild bunny.
   */
  public WildBunny(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorWild();
    animalDiet = new Carnivora(animalWeight, 90);
    id = 0;
    position.setLocation(locX, locY);
    isLandAnimal = true;
    isWaterAnimal = false;
    isAirAnimal = false;

    for (int id = 0; id < 22; id++) {
      animalBehavior.addEnemy(id);
    }
  }

  /**
   * Mengatur interaksi dengan wild bunny.
   */
  public void interact() {
    System.out.println("The wild bunny is looking at you with murderous intent");
  }
}

package virtualzoo.animal.aves;

import virtualzoo.animal.behavior.BehaviorWild;
import virtualzoo.animal.diet.Herbivora;

/**
 * Kelas WildColibri mendefinisikan atribut untuk wild colibri.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class WildColibri extends Aves {

  /**
   * Constructor
   *
   * Menciptakan wild colibri dengan posisi (locX, locY) dan berat animalWeight.
   *
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat wild colibri.
   */
  public WildColibri(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorWild();
    animalDiet = new Herbivora(animalWeight, 60);
    ID = 21;
    position.setLocation(locX, locY);
    isLandAnimal = true;
    isWaterAnimal = false;
    isAirAnimal = true;
    animalBehavior.addEnemy(2);
    animalBehavior.addEnemy(3);
    animalBehavior.addEnemy(9);
    animalBehavior.addEnemy(19);
  }

  /**
   * Mengatur interaksi dengan wild colibri.
   */
  public void interact() {
    System.out.println("The wild colibri is going to skewer your eyes");
  }
}

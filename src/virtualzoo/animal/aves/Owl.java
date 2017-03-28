package virtualzoo.animal.aves;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Carnivora;

/**
 * Kelas Owl mendefinisikan atribut untuk owl.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class Owl extends Aves {

  /**
   * Constructor
   *
   * Menciptakan owl dengan posisi (locX,locY) dan berat animalWeight.
   *
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat owl.
   */
  public Owl(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorTame();
    animalDiet = new Carnivora(animalWeight, 60);
    ID = 16;
    position.setLocation(locX, locY);
    isLandAnimal = true;
    isWaterAnimal = false;
    isAirAnimal = true;
  }

  /**
   * Mengatur interaksi owl.
   */
  public void interact() {
    System.out.println("The owl is hooting randomly");
  }
}
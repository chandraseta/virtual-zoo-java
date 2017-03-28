package virtualzoo.animal.pisces;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Carnivora;

/**
 * Kelas Shark mendefinisikan atribut untuk shark.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class Shark extends Pisces {

  /**
   * Constructor
   *
   * Menciptakan barracuda dengan posisi (locX,locY) dan berat animalWeight.
   *
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat barracuda.
   */
  public Shark(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorTame();
    animalDiet = new Carnivora(animalWeight, 70);
    ID = 13;
    position.setLocation(locX, locY);
    isLandAnimal = false;
    isWaterAnimal = true;
    isAirAnimal = false;
  }

  /**
   * Mengatur interaksi dengan shark.
   */
  public void interact() {
    System.out.println("The shark is staring at you menacingly");
  }
}

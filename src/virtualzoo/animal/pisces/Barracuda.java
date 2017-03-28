package virtualzoo.animal.pisces;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Carnivora;

/**
 * Kelas Barracuda mendefinisikan atribut untuk barracuda.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class Barracuda extends Pisces {

  /** <p>
   * Constructor
   *
   * Menciptakan barracuda dengan posisi (locX,locY) dan berat animalWeight.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat barracuda.
   */
  public Barracuda(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorTame();
    animalDiet = new Carnivora(animalWeight, 60);
    id = 15;
    position.setLocation(locX, locY);
    isLandAnimal = false;
    isWaterAnimal = true;
    isAirAnimal = false;
  }

  /**
   * Mengatur interaksi dengan barracuda.
   */
  public void interact() {
    System.out.println("The barracuda completely ignores you");
  }
}

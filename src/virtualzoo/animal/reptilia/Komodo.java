package virtualzoo.animal.reptilia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Carnivora;

/**
 * Kelas Komodo mendefinisikan atribut untuk komodo.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class Komodo extends Reptilia {

  /**
   * Constructor
   *
   * Menciptakan komodo dengan posisi (locX,locY) dan berat animalWeight.
   *
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat iguana.
   */
  public Komodo(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorTame();
    animalDiet = new Carnivora(animalWeight, 70);
    ID = 10;
    position.setLocation(locX, locY);
    isLandAnimal = true;
    isWaterAnimal = false;
    isAirAnimal = false;
  }

  /**
   * Mengatur interaksi dengan komodo.
   */
  public void interact() {
    System.out.println("The komodo is looking at you intensely");
  }
}

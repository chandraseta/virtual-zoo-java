package virtualzoo.animal.mammalia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Herbivora;

/**
 * Created by Rionaldi Chandraset on 27/03/2017.
 */
public class Zebra extends Mammalia {

  /**
   * Constructor
   *
   * Menciptakan elephant dengan posisi (locX,locY) dan berat animalWeight.
   *
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat zebra.
   */
  public Zebra(int locX, int locY, int animalWeight) {
    super();
    animalBehavior = new BehaviorTame();
    animalDiet = new Herbivora(animalWeight, 45);
    ID = 4;
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

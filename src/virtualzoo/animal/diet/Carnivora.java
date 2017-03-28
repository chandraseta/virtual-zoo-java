package virtualzoo.animal.diet;

/**
 * Kelas Carnivora yang mendefinisikan Animal pemakan daging.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class Carnivora extends AnimalDiet {

  /**
   * Constructor
   *
   * Menciptakan Carnivora (Animal pemakan daging).
   *
   * @param animalWeight Nilai berat Animal (jalam kilogram).
   * @param animalRatioMeat Rasio (%) jumlah daging yang dibutuhkan terhadap berat Animal.
   */
  public Carnivora(int animalWeight, int animalRatioMeat) {
    weight = animalWeight;
    ratioMeat = animalRatioMeat;
    ratioPlant = 0;
    eatMeat = true;
    eatPlant = false;
  }

  /**
   * Getter nilai makanan Animal dalam bentuk daging yang dibutuhkan
   *
   * @return Jumlah daging yang dibutuhkan untuk Animal tertentu
   */
  public int getReqMeat() {
    return (ratioMeat * weight / 100);
  }

  /**
   * Getter nilai makanan Animal dalam bentuk tumbuhan yang dibutuhkan
   *
   * @return Jumlah tumbuhan yang dibutuhkan untuk Animal tertentu
   */
  public int getReqPlant() {
    return 0;
  }
}

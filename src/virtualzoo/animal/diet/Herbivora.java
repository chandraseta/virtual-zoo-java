package virtualzoo.animal.diet;

/**
 * Kelas Herbivora yang mendefinisikan Animal pemakan tumbuhan.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class Herbivora extends AnimalDiet {

  /** <p>
   * Constructor
   *
   * Menciptakan Herbivora (Animal pemakan tumbuhan).
   * </p>
   * @param animalWeight Nilai berat Animal (jalam kilogram).
   * @param animalRatioPlant Rasio (%) jumlah tumbuhan yang dibutuhkan terhadap berat Animal.
   */
  public Herbivora(int animalWeight, int animalRatioPlant) {
    weight = animalWeight;
    ratioMeat = 0;
    ratioPlant = animalRatioPlant;
    eatMeat = false;
    eatPlant = true;
  }

  /**
   * <p>
   * Getter nilai makanan Animal dalam bentuk daging yang dibutuhkan.
   * </p>
   * @return Jumlah daging yang dibutuhkan untuk Animal tertentu.
   */
  public int getReqMeat() {
    return 0;
  }

  /**
   * <p>
   * Getter nilai makanan Animal dalam bentuk tumbuhan yang dibutuhkan.
   * </p>
   * @return Jumlah tumbuhan yang dibutuhkan untuk Animal tertentu.
   */
  public int getReqPlant() {
    return (ratioPlant * weight / 100);
  }
}

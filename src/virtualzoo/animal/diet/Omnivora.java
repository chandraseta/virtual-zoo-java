package virtualzoo.animal.diet;

/** <p>
 * Kelas Omnivora yang mendefinisikan Animal pemakan daging dan tumbuhan.
 * </p>
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class Omnivora extends AnimalDiet {

  /**<p>
   * Constructor
   *
   * Menciptakan Omnivora (Animal pemakan daging dan tumbuhan).
   * </p>
   * @param animalWeight Nilai berat Animal (jalam kilogram).
   * @param animalRatioMeat Rasio (%) jumlah daging yang dibutuhkan terhadap berat Animal.
   * @param animalRatioPlant Rasio (%) jumlah tumbuhan yang dibutuhkan terhadap berat Animal.
   */
  public Omnivora(int animalWeight, int animalRatioMeat, int animalRatioPlant) {
    weight = animalWeight;
    ratioMeat = animalRatioMeat;
    ratioPlant = animalRatioPlant;
    eatMeat = true;
    eatPlant = true;
  }

  /**
   * <p>
   * Getter nilai makanan Animal dalam bentuk daging yang dibutuhkan.
   * </p>
   * @return Jumlah daging yang dibutuhkan untuk Animal tertentu.
   */
  public int getReqMeat() {
    return (ratioMeat * weight / 100);
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

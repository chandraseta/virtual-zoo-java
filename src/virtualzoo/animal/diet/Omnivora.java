package virtualzoo.animal.diet;

/**
 * Kelas Omnivora yang mendefinisikan Animal pemakan daging dan tumbuhan.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public class Omnivora extends AnimalDiet {

  /**
   * Constructor
   *
   * Menciptakan Omnivora (Animal pemakan daging dan tumbuhan).
   *
   * @param _weight Nilai berat Animal (jalam kilogram).
   * @param _ratioMeat Rasio (%) jumlah daging yang dibutuhkan terhadap berat Animal.
   * @param _ratioPlant Rasio (%) jumlah tumbuhan yang dibutuhkan terhadap berat Animal.
   */
  public Omnivora(int _weight, int _ratioMeat, int _ratioPlant) {
    weight = _weight;
    ratioMeat = _ratioMeat;
    ratioPlant = _ratioPlant;
    eatMeat = true;
    eatPlant = true;
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
    return (ratioPlant * weight / 100);
  }
}

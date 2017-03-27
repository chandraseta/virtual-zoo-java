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
   * @param _ratio_meat Rasio (%) jumlah daging yang dibutuhkan terhadap berat Animal.
   * @param _ratio_plant Rasio (%) jumlah tumbuhan yang dibutuhkan terhadap berat Animal.
   */
  public Omnivora(int _weight, int _ratio_meat, int _ratio_plant) {
    weight = _weight;
    ratio_meat = _ratio_meat;
    ratio_plant = _ratio_plant;
    eat_meat = true;
    eat_plant = true;
  }

  /**
   * Getter nilai makanan Animal dalam bentuk daging yang dibutuhkan
   *
   * @return Jumlah daging yang dibutuhkan untuk Animal tertentu
   */
  public int getReqMeat() {
    return (ratio_meat * weight / 100);
  }

  /**
   * Getter nilai makanan Animal dalam bentuk tumbuhan yang dibutuhkan
   *
   * @return Jumlah tumbuhan yang dibutuhkan untuk Animal tertentu
   */
  public int getReqPlant() {
    return (ratio_plant * weight / 100);
  }
}

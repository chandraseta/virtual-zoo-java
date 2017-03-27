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
   * @param _weight Nilai berat Animal (jalam kilogram).
   * @param _ratio_meat Rasio (%) jumlah daging yang dibutuhkan terhadap berat Animal.
   */
  public Carnivora(int _weight, int _ratio_meat) {
    weight = _weight;
    ratio_meat = _ratio_meat;
    ratio_plant = 0;
    eat_meat = true;
    eat_plant = false;
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
    return 0;
  }
}

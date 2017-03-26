package virtualzoo.animal.diet;

/**
 * Kelas Herbivora yang mendefinisikan Animal pemakan tumbuhan.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since   3.0
 */
public class Herbivora extends AnimalDiet {
    /**
     * Constructor
     *
     * Menciptakan Herbivora (Animal pemakan tumbuhan).
     * @param _weight Nilai berat Animal (jalam kilogram).
     * @param _ratio_plant Rasio (%) jumlah tumbuhan yang dibutuhkan terhadap berat Animal.
     */
    public Herbivora(int _weight, int _ratio_plant) {
        weight = _weight;
        ratio_meat = 0;
        ratio_plant = _ratio_plant;
        eat_meat = false;
        eat_plant = true;
    }

    /**
     * Getter nilai makanan Animal dalam bentuk daging yang dibutuhkan
     * @return Jumlah daging yang dibutuhkan untuk Animal tertentu
     */
    public int GetReqMeat() {
        return 0;
    }

    /**
     * Getter nilai makanan Animal dalam bentuk tumbuhan yang dibutuhkan
     * @return Jumlah tumbuhan yang dibutuhkan untuk Animal tertentu
     */
    public int GetReqPlant() {
        return (ratio_plant * weight / 100);
    }
}

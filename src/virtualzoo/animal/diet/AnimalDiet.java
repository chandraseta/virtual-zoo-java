package virtualzoo.animal.diet;

/**
 * Kelas AnimalDiet yang mendefinisikan jenis makanan
 * Animal tertentu.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since   3.0
 */
public abstract class AnimalDiet {
    /**
     * Nilai berat Animal (dalam kilogram).
     */
    protected int weight;
    /**
     * Atribut yang menentukan apakah Animal memakan daging atau tidak.
     */
    protected boolean eat_meat;
    /**
     * Atribut yang menentukan apakah Animal memakan tumbuhan atau tidak.
     */
    protected boolean eat_plant;
    /**
     * Nilai rasio berat daging yang diperlukan terhadap berat Animal.
     */
    protected int ratio_meat;
    /**
     * Nilai rasio berat tumbuhan yang diperlukan terhadap berat Animal.
     */
    protected int ratio_plant;

    /**
     * Menentukan apakah Animal yang dimaksud merupakan carnivora.
     * @return Nilai true/false apakah Animal herbivora.
     */
    public boolean IsHerbivore() {
        return (!eat_meat && eat_plant);
    }

    /**
     * Menentukan apakah Animal yang dimaksud merupakan carnivora.
     * @return Nilai true/false apakah Animal carnivora.
     */
    public boolean IsCarnivore() {
        return (eat_meat && !eat_plant);
    }

    /**
     * Menentukan apakah Animal yang dimaksud merupakan omnivora.
     * @return Nilai true/false apakah Animal omnivora.
     */
    public boolean IsOmnivore() {
        return (eat_meat && eat_plant);
    }

    /**
     * Menentukan kebutuhan makanan Animal yang berupa daging.
     * @return Jumlah daging yang dibutuhkan.
     */
    public abstract int GetReqMeat();

    /**
     * Menentukan kebutuhan makanan Animal yang berupa tumbuhan.
     * @return Jumlah tumbuhan yang diperlukan.
     */
    public abstract int GetReqPlant();
}

package virtualzoo.animal.diet;

/**
 * Kelas AnimalDiet yang mendefinisikan jenis makanan
 * Animal tertentu.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public abstract class AnimalDiet {

  /**
   * Nilai berat Animal (dalam kilogram).
   */
  protected int weight;
  /**
   * Atribut yang menentukan apakah Animal memakan daging atau tidak.
   */
  protected boolean eatMeat;
  /**
   * Atribut yang menentukan apakah Animal memakan tumbuhan atau tidak.
   */
  protected boolean eatPlant;
  /**
   * Nilai rasio berat daging yang diperlukan terhadap berat Animal.
   */
  protected int ratioMeat;
  /**
   * Nilai rasio berat tumbuhan yang diperlukan terhadap berat Animal.
   */
  protected int ratioPlant;

  /**
   * Menentukan apakah Animal yang dimaksud merupakan carnivora.
   *
   * @return Nilai true/false apakah Animal herbivora.
   */
  public boolean isHerbivore() {
    return (!eatMeat && eatPlant);
  }

  /**
   * Menentukan apakah Animal yang dimaksud merupakan carnivora.
   *
   * @return Nilai true/false apakah Animal carnivora.
   */
  public boolean isCarnivore() {
    return (eatMeat && !eatPlant);
  }

  /**
   * Menentukan apakah Animal yang dimaksud merupakan omnivora.
   *
   * @return Nilai true/false apakah Animal omnivora.
   */
  public boolean isOmnivore() {
    return (eatMeat && eatPlant);
  }

  /**
   * Menentukan kebutuhan makanan Animal yang berupa daging.
   *
   * @return Jumlah daging yang dibutuhkan.
   */
  public abstract int getReqMeat();

  /**
   * Menentukan kebutuhan makanan Animal yang berupa tumbuhan.
   *
   * @return Jumlah tumbuhan yang diperlukan.
   */
  public abstract int getReqPlant();
}

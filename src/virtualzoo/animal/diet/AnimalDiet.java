package virtualzoo.animal.diet;

/** <p>
 * Kelas AnimalDiet yang mendefinisikan jenis makanan
 * Animal tertentu.
 * </p>
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public abstract class AnimalDiet {

  /** <p>
   * Nilai berat Animal (dalam kilogram).
   * </p>
   */
  protected int weight;
  /** <p>
   * Atribut yang menentukan apakah Animal memakan daging atau tidak.
   * </p>
   */
  protected boolean eatMeat;
  /** <p>
   * Atribut yang menentukan apakah Animal memakan tumbuhan atau tidak.
   * </p>
   */
  protected boolean eatPlant;
  /** <p>
   * Nilai rasio berat daging yang diperlukan terhadap berat Animal.
   * </p>
   */
  protected int ratioMeat;
  /** <p>
   * Nilai rasio berat tumbuhan yang diperlukan terhadap berat Animal.
   * </p>
   */
  protected int ratioPlant;

  /** <p>
   * Menentukan berat badan Animal.
   * </p>
   * @return Nilai weight.
   */
  public int getWeight() {
    return (weight);
  }

  /** <p>
   * Menentukan apakah Animal yang dimaksud merupakan carnivora.
   * </p>
   * @return Nilai true/false apakah Animal herbivora.
   */
  public boolean isHerbivore() {
    return (!eatMeat && eatPlant);
  }

  /** <p>
   * Menentukan apakah Animal yang dimaksud merupakan carnivora.
   * </p>
   * @return Nilai true/false apakah Animal carnivora.
   */
  public boolean isCarnivore() {
    return (eatMeat && !eatPlant);
  }

  /** <p>
   * Menentukan apakah Animal yang dimaksud merupakan omnivora.
   * </p>
   * @return Nilai true/false apakah Animal omnivora.
   */
  public boolean isOmnivore() {
    return (eatMeat && eatPlant);
  }

  /** <p>
   * Menentukan kebutuhan makanan Animal yang berupa daging.
   * </p>
   * @return Jumlah daging yang dibutuhkan.
   */
  public abstract int getReqMeat();

  /** <p>
   * Menentukan kebutuhan makanan Animal yang berupa tumbuhan.
   * </p>
   * @return Jumlah tumbuhan yang diperlukan.
   */
  public abstract int getReqPlant();
}

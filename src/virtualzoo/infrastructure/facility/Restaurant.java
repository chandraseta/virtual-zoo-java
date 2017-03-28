package virtualzoo.infrastructure.facility;

/**
 * Kelas Restaurant mendefinisikan sebuah tempat makan di dalam Zoo.
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since 3.0
 */
public class Restaurant extends Facility {

  /**
   * Nama untuk setiap Restaurant.
   */
  protected String name;

  /** <p>
   * Constructor
   *
   * Membuat sebuah restaurant.
   * </p>
   * @param accessible Nilai restauran bisa diakses atau tidak.
   * @param facilityName Nama restauran.
   */
  public Restaurant(boolean accessible, String facilityName) {
    super(accessible);
    facilityType = "Restaurant";
    name = facilityName;
  }

  /**
   * <p>
   * Getter Restaurant name.
   * </p>
   * @return Nama Restaurant
   */
  public String getRestaurantName() {
    return name;
  }

  /**
   * Mengembalikan suatu char yang menandakan Park dalam satu Cell.
   */
  public char render() {
    return 'R';
  }
}
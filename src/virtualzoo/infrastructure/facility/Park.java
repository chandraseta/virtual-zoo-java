package virtualzoo.infrastructure.facility;

/**
 * Kelas Park mendefinisikan sebuah taman di dalam Zoo.
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since 3.0
 */
public class Park extends Facility {

  /**
   * Nama untuk setiap Park.
   */
  protected String name;

  /** <p>
   * Constructor
   *
   * Membuat sebuah taman.
   * </p>
   * @param accessible Nilai park bisa diakses atau tidak.
   * @param facilityName Nama park.
   */
  public Park(boolean accessible, String facilityName) {
    super(accessible);
    facilityType = "Park";
    name = facilityName;
  }

  /**
   * <p>
   * Getter Park name.
   * </p>
   * @return Nama Park
   */
  public String getParkName() {
    return name;
  }

  /**
   * Mengembalikan suatu char yang menandakan Park dalam satu Cell.
   */
  public char render() {
    return '*';
  }
}

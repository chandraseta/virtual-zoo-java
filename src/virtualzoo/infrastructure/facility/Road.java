package virtualzoo.infrastructure.facility;

/**
 * Kelas Road mendefinisikan sebuah jalan di dalam Zoo.
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since 3.0
 */
public class Road extends Facility {

  /**
   * Jalan merupakan jalan masuk Zoo.
   */
  protected boolean roadEntrance;
  /**
   * Jalan merupakan jalan keluar Zoo.
   */
  protected boolean roadExit;

  /**
   * Constructor
   *
   * Membuat sebuah jalan.
   *
   * @param accessible Jalan dapat diakses pengunjung.
   */
  public Road(boolean accessible) {
    super(accessible);
    facilityType = "Road";
    roadEntrance = false;
    roadExit = false;
  }

  /**
   * @return Nilai roadEntrance.
   */
  public boolean isEntrance() {
    return roadEntrance;
  }

  /**
   * @return Nilai roadExit.
   */
  public boolean isExit() {
    return roadExit;
  }

  /**
   * Mengembalikan suatu char yang menandakan Park dalam satu Cell.
   */
  public char render() {
    return '.';
  }
}


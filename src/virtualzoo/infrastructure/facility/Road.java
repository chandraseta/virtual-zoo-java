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
  protected boolean is_entrance;
  /**
   * Jalan merupakan jalan keluar Zoo.
   */
  protected boolean is_exit;

  /**
   * Constructor
   *
   * Membuat sebuah jalan.
   *
   * @param accessible Jalan dapat diakses pengunjung.
   */
  public Road(boolean accessible) {
    super(accessible);
    facility_type = "Road";
    is_entrance = false;
    is_exit = false;
  }

  /**
   * @return Nilai is_entrance.
   */
  public boolean isEntrance() {
    return is_entrance;
  }

  /**
   * @return Nilai is_exit.
   */
  public boolean isExit() {
    return is_exit;
  }

  /**
   * Mengembalikan suatu char yang menandakan Park dalam satu Cell.
   */
  public char render() {
    return '.';
  }
}


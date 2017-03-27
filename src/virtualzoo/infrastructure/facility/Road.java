package virtualzoo.infrastructure.facility;

import virtualzoo.misc.*;

/**
 * Kelas Road mendefinisikan sebuah jalan di dalam Zoo.
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since 3.0
 */
public class Road extends Facility implements Renderable {

  /**
   * Nama untuk setiap Park.
   */
  protected String name;
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
   * @param _name Nama untuk sebuah Park.
   */
  public Road(boolean accessible, String _name) {
    super(accessible);
    facility_type = "Road";
    name = _name;
    is_entrance = false;
    is_exit = false;
  }

  /**
   * Mengembalikan suatu char yang menandakan Park dalam satu Cell.
   */
  public char render() {
    return '.';
  }
}


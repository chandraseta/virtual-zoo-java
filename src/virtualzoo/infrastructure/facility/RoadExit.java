package virtualzoo.infrastructure.facility;

/**
 * Kelas RoadExit mendefinisikan sebuah jalan keluar di dalam Zoo.
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since 3.0
 */
public class RoadExit extends Road {

  /**
   * Constructor
   *
   * Kelas RoadExit mendefinisikan atribut untuk jalan keluar.
   */
  RoadExit(boolean accessible) {
    super(accessible);
    is_exit = true;
  }
}

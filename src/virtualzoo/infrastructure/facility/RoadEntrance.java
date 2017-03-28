package virtualzoo.infrastructure.facility;

/**
 * Kelas RoadEntrance mendefinisikan sebuah jalan masuk di dalam Zoo.
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since 3.0
 */
public class RoadEntrance extends Road {

  /** <p>
   * Constructor
   *
   * Kelas RoadEntrance mendefinisikan atribut untuk jalan masuk.
   * </p>
   * @param accessible Nilai jalan bisa diakses atau tidak.
   */
  public RoadEntrance(boolean accessible) {
    super(accessible);
    roadEntrance = true;
  }

}

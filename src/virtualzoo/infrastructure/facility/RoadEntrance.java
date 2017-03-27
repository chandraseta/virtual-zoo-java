package virtualzoo.infrastructure.facility;

import virtualzoo.infrastructure.facility.Road;

/**
 * Kelas RoadEntrance mendefinisikan sebuah jalan masuk di dalam Zoo.
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since 3.0
 */
public class RoadEntrance extends Road {

  /**
   * Constructor
   *
   * Kelas RoadEntrance mendefinisikan atribut untuk jalan masuk.
   */
  RoadEntrance(boolean accessible, String _name) {
    super(accessible, _name);
    is_entrance = true;
  }

}

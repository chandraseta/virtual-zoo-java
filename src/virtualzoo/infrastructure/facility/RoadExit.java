package virtualzoo.infrastructure.facility;

import virtualzoo.infrastructure.facility.Road;

/**
 * Kelas RoadExit mendefinisikan sebuah jalan keluar di dalam Zoo.
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since   3.0
 */
public class RoadExit extends Road {
    /**
     * Constructor
     *
     * Kelas RoadExit mendefinisikan atribut untuk jalan keluar.
     */
    RoadExit (boolean accessible, String _name) {
        super(accessible, _name);
        is_exit = true;
    }
}

package virtualzoo.infrastructure.facility;

import virtualzoo.infrastructure.facility.Facility;

/**
 * Kelas Park mendefinisikan sebuah taman di dalam Zoo.
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since   3.0
 */
public class Park extends Facility {
    /**
     * Nama untuk setiap Park.
     */
    protected String name;

    /**
     * Constructor
     *
     * Membuat sebuah taman.
     */
    public Park(boolean accessible, String _name) {
        super(accessible);
        facility_type = "Park";
        name = _name;
    }

    /**
     * Mengembalikan suatu char yang menandakan Park dalam satu Cell.
     */
    public char render () {
        return '*';
    }
}

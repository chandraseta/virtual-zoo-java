package virtualzoo.infrastructure.facility;

import virtualzoo.infrastructure.facility.Facility;

/**
 * Kelas Restaurant mendefinisikan sebuah tempat makan di dalam Zoo.
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since   3.0
 */
public class Restaurant extends Facility {
    /**
     * Nama untuk setiap Restaurant.
     */
    protected String name;

    /**
     * Constructor
     *
     * Membuat sebuah restaurant.
     */
    public Restaurant(boolean accessible, String _name) {
        facility_type = "Restaurant";
        is_accessible = accessible;
        name = _name;
    }

    /**
     * Mengembalikan suatu char yang menandakan Park dalam satu Cell.
     */
    public char render () {
        return 'R';
    }
}
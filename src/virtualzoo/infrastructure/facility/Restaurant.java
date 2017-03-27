package virtualzoo.infrastructure.facility;

import virtualzoo.misc.*;

/**
 * Kelas Restaurant mendefinisikan sebuah tempat makan di dalam Zoo.
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since   3.0
 */
public class Restaurant extends Facility implements Renderable {
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
        super(accessible);
        facility_type = "Restaurant";
        name = _name;
    }

    /**
     * Mengembalikan suatu char yang menandakan Park dalam satu Cell.
     */
    public char render () {
        return 'R';
    }
}
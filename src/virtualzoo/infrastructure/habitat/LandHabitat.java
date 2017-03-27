package virtualzoo.infrastructure.habitat;

import virtualzoo.misc.*;

/**
 * Kelas LandHabitat mendefinisikan sebuah habitat darat di dalam Cell.
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since   3.0
 */
public class LandHabitat extends Habitat implements Renderable {

    /**
     * Constructor
     *
     * Menciptakan habitat darat.
     */
    public LandHabitat(accessible) {
        super(accessible);
        type = 'L';
    }

    /**
     * Mengembalikan sebuah char untuk proses render.
     * @return Sebuah char yang menandakan habitat darat.
     */
    public char render() {
        return 'l';
    }
}

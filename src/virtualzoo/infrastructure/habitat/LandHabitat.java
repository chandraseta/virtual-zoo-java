package virtualzoo.infrastructure.habitat;

import virtualzoo.infrastructure.habitat.Habitat;

/**
 * Kelas LandHabitat mendefinisikan sebuah habitat darat di dalam Cell.
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since   3.0
 */
public class LandHabitat extends Habitat {

    /**
     * Constructor
     *
     * Menciptakan habitat darat.
     */
    public LandHabitat() {
        type = 'L';
    }

    /**
     * Mengembalikan sebuah char untuk proses render.
     * @return Sebuah char yang menandakan habitat darat.
     */
    char Render() {
        return 'l';
    }
}

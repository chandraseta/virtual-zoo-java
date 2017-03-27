package virtualzoo.infrastructure.habitat;

import virtualzoo.infrastructure.habitat.Habitat;

/**
 * Kelas WaterHabitat mendefinisikan sebuah habitat air di dalam Cell.
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since   3.0
 */
public class WaterHabitat extends Habitat {

    /**
     * Constructor
     *
     * Menciptakan habitat air.
     */
    public WaterHabitat(accessible) {
        super(accessible);
        type = 'W';
    }

    /**
     * Mengembalikan sebuah char untuk proses render.
     * @return Sebuah char yang menandakan habitat air.
     */
    char Render() {
        return 'w';
    }
}

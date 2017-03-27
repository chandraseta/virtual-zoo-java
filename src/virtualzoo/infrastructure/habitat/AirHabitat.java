package virtualzoo.infrastructure.habitat;

import virtualzoo.infrastructure.habitat.Habitat;

/**
 * Kelas AirHabitat mendefinisikan sebuah habitat udara di dalam Cell
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since   3.0
 */
public class AirHabitat extends Habitat {

    /**
     * Constructor
     *
     * Menciptakan habitat udara.
     */
    public AirHabitat(accessible) {
        super(accessible);
        type = 'A';
    }

    /**
     * Mengembalikan sebuah char untuk proses render.
     * @return Sebuah char yang menandakan habitat udara.
     */
    char Render() {
        return 'a';
    }
}

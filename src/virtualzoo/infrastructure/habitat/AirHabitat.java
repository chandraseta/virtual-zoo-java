package virtualzoo.infrastructure.habitat;

import virtualzoo.misc.*;

/**
 * Kelas AirHabitat mendefinisikan sebuah habitat udara di dalam Cell
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since 3.0
 */
public class AirHabitat extends Habitat implements Renderable {

  /**
   * Constructor
   *
   * Menciptakan habitat udara.
   */
  public AirHabitat() {
    super();
    type = 'A';
  }

  /**
   * Mengembalikan sebuah char untuk proses render.
   *
   * @return Sebuah char yang menandakan habitat udara.
   */
  public char render() {
    return 'a';
  }
}

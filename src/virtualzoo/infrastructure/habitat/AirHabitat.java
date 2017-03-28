package virtualzoo.infrastructure.habitat;

/**
 * Kelas AirHabitat mendefinisikan sebuah habitat udara di dalam Cell
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since 3.0
 */
public class AirHabitat extends Habitat {

  /**<p>
   * Constructor
   *
   * Menciptakan habitat udara.
   * </p>
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

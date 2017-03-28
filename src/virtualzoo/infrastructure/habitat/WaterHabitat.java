package virtualzoo.infrastructure.habitat;

/**
 * Kelas WaterHabitat mendefinisikan sebuah habitat air di dalam Cell.
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since 3.0
 */
public class WaterHabitat extends Habitat {

  /**
   * Constructor
   *
   * Menciptakan habitat air.
   */
  public WaterHabitat() {
    super();
    type = 'W';
  }

  /**
   * Mengembalikan sebuah char untuk proses render.
   *
   * @return Sebuah char yang menandakan habitat air.
   */
  public char render() {
    return 'w';
  }
}

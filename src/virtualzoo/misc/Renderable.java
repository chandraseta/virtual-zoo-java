package virtualzoo.misc;

/**
 * <p>
 * Kelas Renderable yang merupakan Abstract Base Class untuk proses render.
 * </p>
 * @author Felix Limanta - 13515065
 * @version 3.0
 * @since 3.0
 */
public interface Renderable {

  /**
   * Untuk render ke layar.
   * Didefiniskan pada kelas turunan.
   * @return Karakter untuk proses render.
   */
  char render();
}

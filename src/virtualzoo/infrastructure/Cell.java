package virtualzoo.infrastructure;

import virtualzoo.misc.Renderable;

/**
 * Kelas Cell yang mendefinisikan aksesibilitas suatu cell.
 *
 * @author Felix Limanta - 13515065
 * @version 3.0
 * @since 3.0
 */
public abstract class Cell implements Renderable {

  /**
   * Suatu Cell dapat dikunjungi atau tidak oleh pengunjung
   */
  protected boolean infrastructureAccessible;

  /**
   * Constructor
   * Menciptakan cell default yang dapat/tidak dapat diakses.
   *
   * @param accessible Nilai true/false cell dapat diakses.
   */
  public Cell(boolean accessible) {
    infrastructureAccessible = accessible;
  }

  /**
   * Getter nilai infrastructureAccessible
   *
   * @return Nilai infrastructureAccessible
   */
  public boolean isAccessible() {
    return infrastructureAccessible;
  }
}

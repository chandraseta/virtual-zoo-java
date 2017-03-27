package virtualzoo.infrastructure;

/**
 * Kelas Cell yang mendefinisikan aksesibilitas suatu cell.
 *
 * @author Felix Limanta - 13515065
 * @version 3.0
 * @since   3.0
 */
public abstract class Cell {
    /**
     * Suatu Cell dapat dikunjungi atau tidak oleh pengunjung
     */
    protected boolean is_accessible;

    /** Constructor
     * Menciptakan cell default yang dapat/tidak dapat diakses.
     * @param accessible Nilai true/false cell dapat diakses.
     */
    public Cell(boolean accessible) {
        is_accessible = accessible;
    }

    /** Getter nilai is_accessible
     * @return Nilai is_accessible
     */
    boolean isAccessible() {
        return is_accessible;
    }
}

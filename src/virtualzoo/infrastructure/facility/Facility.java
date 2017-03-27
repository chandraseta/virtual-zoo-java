package virtualzoo.infrastructure.facility;

import virtualzoo.infrastructure.Cell;

/**
 * Kelas Facility merupakan superclass untuk jenis-jenis Facility
 * di dalam Zoo
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since   3.0
 */
public abstract class Facility extends Cell {
    /**
     * Jenis Facility yang ada di dalam Zoo
     */
    protected String facility_type;

    /**
     * Constructor
     * Menciptakan cell berisi fasilitas yang dapat/tidak dapat diakses.
     * @param accessible Nilai true/false apakah dapat diakses.
     */
    Facility(boolean accessible) {
        super(accessible);
    }
}

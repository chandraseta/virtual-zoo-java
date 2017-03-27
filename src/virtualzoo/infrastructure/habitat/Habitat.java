package virtualzoo.infrastructure.habitat;

import virtualzoo.infrastructure.Cell;

/**
 * Kelas Habitat merupakan superclass dari jenis-jenis habitat
 * yang ada di dalam Zoo.
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since 3.0
 */
public abstract class Habitat extends Cell {

  /**
   * Jenis habitat untuk setiap Cell.
   */
  protected char type;

  /**
   * Constructor
   *
   * Menciptakan sebuah habitat dalam suatu Cell.
   */
  public Habitat() {
    super(false);
  }

}

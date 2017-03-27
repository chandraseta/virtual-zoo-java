package virtualzoo.animal.aves;

import virtualzoo.animal.Animal;

/**
 * Kelas Aves yang mendefinisikan Animal yang termasuk dalam
 * taksonomi biologis aves.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 */
public abstract class Aves extends Animal {

  /**
   * Constructor
   *
   * Menciptakan Aves dengan atribut default untuk aves pada umumnya
   */
  public Aves() {
    limb_count = 2;
    skin_type = "Feather";
  }
}

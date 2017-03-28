package virtualzoo.animal.aves;

import virtualzoo.animal.Animal;

/** <p>
 * Kelas Aves yang mendefinisikan Animal yang termasuk dalam
 * taksonomi biologis aves.
 * </p>
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since 3.0
 *
 */
public abstract class Aves extends Animal {

  /** <p>
   * Constructor
   *
   * Menciptakan Aves dengan atribut default untuk aves pada umumnya.
   * </p>
   */
  public Aves() {
    limbCount = 2;
    skinType = "Feather";
  }
}

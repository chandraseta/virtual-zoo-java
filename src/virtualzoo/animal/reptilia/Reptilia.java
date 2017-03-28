package virtualzoo.animal.reptilia;

import virtualzoo.animal.Animal;

/**
 * Kelas Reptilia yang mendefinisikan Animal yang termasuk dalam
 * taksonomi biologis reptilia.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public abstract class Reptilia extends Animal {

  /**
   * Menciptakan reptilia dengan atribut default untuk reptilia pada umumnya
   */
  public Reptilia() {
    limbCount = 4;
    skinType = "Scutes";
  }
}
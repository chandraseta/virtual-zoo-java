package virtualzoo.animal.pisces;

import virtualzoo.animal.Animal;

/**
 * Kelas Pisces yang mendefinisikan Animal yang termasuk dalam
 * taksonomi biologis pisces.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since   3.0
 */
public abstract class Pisces extends Animal {
    /**
     * Menciptakan pisces dengan atribut default untuk pisces pada umumnya
     */
    Pisces() {
        limb_count = 0;
        skin_type = "Scales";
    }
}
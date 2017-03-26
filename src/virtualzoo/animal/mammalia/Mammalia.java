package virtualzoo.animal.mammalia;

import virtualzoo.animal.Animal;

/**
 * Kelas Mammalia yang mendefinisikan Animal yang termasuk dalam
 * taksonomi biologis mammalia.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since   3.0
 */
public abstract class Mammalia extends Animal {
    /**
     * Menciptakan mammalia dengan atribut default untuk mammalia pada umumnya
     */
    Mammalia() {
        limb_count = 4;
        skin_type = "Hair";
    }
}

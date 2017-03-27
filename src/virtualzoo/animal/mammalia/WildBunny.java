package virtualzoo.animal.mammalia;

import virtualzoo.animal.behavior.BehaviorWild;
import virtualzoo.animal.diet.Carnivora;

/**
 * Kelas WildBunny mendefinisikan atribut untuk wild bunny.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since   3.0
 */
public class WildBunny extends Mammalia {
    /**
     * Constructor
     *
     * Menciptakan wild bunny dengan posisi (_x, _y) dan berat _weight.
     * @param _x Nilai absis posisi.
     * @param _y Nilai ordinat posisi.
     * @param _weight Nilai berat wild bunny.
     */
    public WildBunny(int _x, int _y, int _weight) {
        super();
        animal_behavior = new BehaviorWild();
        animal_diet = new Carnivora(_weight, 90);
        ID = 0;
        position.setLocation(_x, _y);
        is_land_animal = true;
        is_water_animal = false;
        is_air_animal = false;

        for (int id = 0; id < 22; id++) {
            animal_behavior.addEnemy(id);
        }
    }

    /**
     * Mengatur interaksi dengan wild bunny.
     */
    public void interact() {
        System.out.println("The wild bunny is looking at you with murderous intent");
    }
}

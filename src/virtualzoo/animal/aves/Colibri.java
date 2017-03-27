package virtualzoo.animal.aves;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Herbivora;

/**
 * Kelas Colibri mendefinisikan atribut untuk colibri.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since   3.0
 */
public class Colibri extends Aves {
    /**
     * Constructor
     *
     * Menciptakan colibri dengan posisi (_x,_y) dan berat _weight.
     * @param _x Nilai absis posisi.
     * @param _y Nilai ordinat posisi.
     * @param _weight Nilai berat colibri.
     */
    public Colibri(int _x, int _y, int _weight) {
        super();
        animal_behavior = new BehaviorTame();
        animal_diet = new Herbivora(_weight, 60);
        ID = 18;
        position.setLocation(_x, _y);
        is_land_animal = true;
        is_water_animal = false;
        is_air_animal = true;
    }

    /**
     * Mengatur interaksi colibri.
     */
    public void interact() {
        System.out.println("The colibri is looking at you, apparently" +
                "confused");
    }
}
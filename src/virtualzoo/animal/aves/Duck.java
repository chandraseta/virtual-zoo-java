package virtualzoo.animal.aves;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Omnivora;

/**
 * Kelas Duck mendefinisikan atribut untuk duck.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since   3.0
 */
public class Duck extends Aves {
    /**
     * Constructor
     *
     * Menciptakan colibri dengan posisi (_x,_y) dan berat _weight.
     * @param _x Nilai absis posisi.
     * @param _y Nilai ordinat posisi.
     * @param _weight Nilai berat duck.
     */
    public Duck (int _x, int _y, int _weight) {
        super();
        animal_behavior = new BehaviorTame();
        animal_diet = new Omnivora(_weight, 60, 60);
        ID = 20;
        position.setLocation(_x, _y);
        is_land_animal = true;
        is_water_animal = true;
        is_air_animal = true;
    }

    /**
     * Mengatur interaksi duck.
     */
    public void interact() {
        System.out.println("The duck just quacked loudly");
    }
}
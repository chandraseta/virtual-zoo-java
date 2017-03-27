package virtualzoo.animal.mammalia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Omnivora;

/**
 * Kelas Monkey mendefinisikan atribut untuk monkey.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since   3.0
 */
public class Monkey extends Mammalia {
    /**
     * Constructor
     *
     * Menciptakan monkey dengan posisi (_x,_y) dan berat _weight.
     * @param _x Nilai absis posisi.
     * @param _y Nilai ordinat posisi.
     * @param _weight Nilai berat monkey.
     */
    public Monkey (int _x, int _y, int _weight) {
        super();
        animal_behavior = new BehaviorTame();
        animal_diet = new Omnivora(_weight, 10, 40);
        ID = 5;
        position.setLocation(_x, _y);
        is_land_animal = true;
        is_water_animal = false;
        is_air_animal = false;
    }

    /**
     * Mengatur interaksi dengan monkey.
     */
    public void interact() {
        System.out.println("The monkey is peeling a banana");
    }
}

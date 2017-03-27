package virtualzoo.animal.mammalia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Herbivora;

/**
 * Kelas Elephant mendefinisikan atribut untuk elephant.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since   3.0
 */
public class Elephant extends Mammalia {
    /**
     * Constructor
     *
     * Menciptakan elephant dengan posisi (_x,_y) dan berat _weight.
     * @param _x Nilai absis posisi.
     * @param _y Nilai ordinat posisi.
     * @param _weight Nilai berat elephant
     */
    public Elephant(int _x, int _y, int _weight) {
        animal_behavior = new BehaviorTame();
        animal_diet = new Herbivora(_weight, 80);
        ID = 3;
        position.setLocation(_x, _y);
        is_land_animal = true;
        is_water_animal = false;
        is_air_animal = false;
    }

    /**
     * Mengatur interaksi elephant
     */
    public void interact() {
        System.out.println("The elephant is playing with its own trunk");
    }
}

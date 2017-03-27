package virtualzoo.animal.mammalia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Carnivora;

/**
 * Kelas Wolf mendefinisikan atribut untuk wolf.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since   3.0
 */
public class Wolf extends Mammalia {
    /**
     * Constructor
     *
     * Menciptakan wolf dengan posisi (_x,_y) dan berat _weight.
     * @param _x Nilai absis posisi.
     * @param _y Nilai ordinat posisi.
     * @param _weight Nilai berat elephant.
     */
    public Wolf(int _x, int _y, int _weight) {
        super();
        animal_behavior = new BehaviorTame();
        animal_diet = new Carnivora(_weight, 50);
        ID = 1;
        position.setLocation(_x, _y);
        is_land_animal = true;
        is_water_animal = false;
        is_air_animal = false;
    }

    /**
     * Mengatur interaksi dengan wolf.
     */
    public void interact() {
        System.out.println("The wolf is howling");
    }
}

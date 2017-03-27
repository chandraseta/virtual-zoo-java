package virtualzoo.animal.mammalia;

import virtualzoo.animal.behavior.BehaviorTame;
import virtualzoo.animal.diet.Carnivora;

/**
 * Kelas Lion mendefinisikan atribut untuk lion.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since   3.0
 */
public class Lion extends Mammalia {
    /**
     * Constructor
     *
     * Menciptakan lion dengan posisi (_x,_y) dan berat _weight.
     * @param _x Nilai absis posisi.
     * @param _y Nilai ordinat posisi.
     * @param _weight Nilai berat lion.
     */
    public Lion(int _x, int _y, int _weight) {
        super();
        animal_behavior = new BehaviorTame();
        animal_diet = new Carnivora(_weight, 60);
        ID = 2;
        position.setLocation(_x, _y);
        is_land_animal = true;
        is_water_animal = false;
        is_air_animal = false;
    }

    /**
     * Mengatur interaksi dengan lion.
     */
    public void interact() {
        System.out.println("The lion is roaring");
    }
}
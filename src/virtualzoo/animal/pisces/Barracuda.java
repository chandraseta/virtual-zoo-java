package src.virtualzoo.animal.pisces;

/**
 * Kelas Barracuda mendefinisikan atribut untuk barracuda.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since   3.0
 */
public class Barracuda extends Pisces {
    /**
     * Constructor
     *
     * Menciptakan barracuda dengan posisi (_x,_y) dan berat _weight.
     * @param _x Nilai absis posisi.
     * @param _y Nilai ordinat posisi.
     * @param _weight Nilai berat barracuda.
     */
    public Barracuda(int _x, int _y, int _weight) {
        super();
        animal_behavior = new BehaviorTame();
        animal_diet = new Carnivora(_weight, 60);
        ID = 15;
        position.setLocation(_x, _y);
        is_land_animal = false;
        is_water_animal = true;
        is_air_animal = false;
    }

    /**
     * Mengatur interaksi dengan barracuda.
     */
    public void interact() {
        System.out.println("The barracuda completely ignores you");
    }
}

package virtualzoo.animal;

import virtualzoo.animal.behavior.AnimalBehavior;
import virtualzoo.animal.diet.AnimalDiet;

import java.awt.*;

/**
 * Kelas Animal merupakan superclass untuk semua jenis hewan
 * yang ada di dalam Zoo.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 3.0
 * @since   3.0
 */
public abstract class Animal {
    /**
     * ID unik untuk setiap jenis Animal.
     */
    protected int ID;
    /**
     * Banyaknya alat gerak yang dimiliki Animal.
     */
    protected int limb_count;
    /**
     * Jenis kulit yang dimiliki Animal.
     */
    protected String skin_type;
    /**
     * Atribut yang menentukan apakah Animal dapat hidup di habitat darat.
     */
    protected boolean is_land_animal;
    /**
     * Atribut yang menentukan apakah Animal dapat hidup di habitat air.
     */
    protected boolean is_water_animal;
    /**
     * Atribut yang menentukan apakah Animal dpaat hidup di habitat udara.
     */
    protected boolean is_air_animal;
    /**
     * Sebuah point yang menyatakan lokasi dari Animal.
     */
    protected Point position;
    /**
     * Atribut yang menentukan kelakuan Animal.
     */
    protected AnimalBehavior animal_behavior;
    /**
     * Atribut yang menentukan jenis makanan hewan.
     */
    protected AnimalDiet animal_diet;

    /**
     * Mengembalikan ID Animal.
     * @return Nilai ID.
     */
    public int getID() {
        return ID;
    }

    /**
     * Mengontrol interaksi Animal.
     * Setiap jenis Animal memiliki interaksi berbeda.
     */
    public abstract void interact();

    /**
     * Menggerakkan Animal dengan mengubah location-nya.
     * @param movement Sebuah nilai yang menentukan arah gerak Animal.
     */
    public void move(int movement) {
        if (movement == 1) {
            position.setLocation(position.getX(), position.getY()-1);
        }
        else if (movement == 2) {
            position.setLocation(position.getX()+1, position.getY());
        }
        else if (movement == 3) {
            position.setLocation(position.getX(), position.getY()+1);
        }
        else {
            position.setLocation(position.getX()-1, position.getY());
        }
    }

    /**
     * Menentukan apakah Animal dapat hidup di habitat darat.
     * @return Nilai is_land_animal.
     */
    public boolean isLandAnimal() {
        return is_land_animal;
    }

    /**
     * Menentukan apakah Animal dapat hidup di habitat air.
     * @return Nilai is_water_animal.
     */
    public boolean isWaterAnimal() {
        return is_water_animal;
    }

    /**
     * Menentukan apakah Animal dapat hidup di habitat udara.
     * @return Nilai is_air_animal.
     */
    public boolean isAirAnimal() {
        return is_air_animal;
    }

    /**
     * Mengembalikan sebuah Point yang berisi lokasi hewan.
     * @return Nilai position.
     */
    public Point getPosition() {
        return position;
    }

    /**
     * Mengembalikan sebuah karakter untuk proses render.
     * @return Sebuah char yang menandakan Animal
     */
    public char render() {
        return 'O';
    }
}
import java.awt.*;

/**
 * Kelas Animal merupakan superclass untuk semua jenis hewan
 * yang ada di dalam Zoo.
 *
 * @author Rionaldi Chandraseta - 13515077
 * @version 1.0
 * @since   1.0
 */
public abstract class Animal {
    /**
     * ID unik untuk setiap jenis Animal
     */
    protected int ID;
    /**
     * Banyaknya alat gerak yang dimiliki Animal
     */
    protected int limb_count;
    /**
     * Jenis kulit dari Animal
     */
    protected String skin_type;
    /**
     * Atribut menyatakan Animal dapat hidup di habitat darat.
     */
    protected boolean is_land_animal;
    /**
     * Atribut menyatakan apakah Animal dapat hidup di habitat air.
     */
    protected boolean is_water_animal;
    /**
     * Atribut menyatakan apakah Animal dapat hidup di habitat udara.
     */
    protected boolean is_air_animal;
    /**
     * Sebuah point yang menyatakan lokasi dari Animal.
     */
    protected Point position;

    /**
     * Mengembalikan ID Animal
     * @return Nilai ID
     */
    public int GetID() {
        return ID;
    }

    /**
     * Mengontrol interaksi Animal.
     * Setiap jenis Animal memiliki interaksi berbeda.
     */
    public abstract void Interact();

    /**
     * Menggerakkan Animal dengan mengubah location-nya.
     * @param movement Sebuah nilai yang menentukan arah gerak Animal
     */
    public void Move(int movement) {
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
     * Mengembalikan nilai apakah Animal dapat hidup di habitat darat.
     * @return Nilai is_land_animal.
     */
    public boolean IsLandAnimal() {
        return is_land_animal;
    }

    /**
     * Mengembalikan nilai apakah Animal dapat hidup di habitat air.
     * @return Nilai is_water_animal.
     */
    public boolean IsWaterAnimal() {
        return is_water_animal;
    }

    /**
     * Mengembalikan nilai apakah Animal dapat hidup di habitat udara.
     * @return Nilai is_air_animal.
     */
    public boolean IsAirAnimal() {
        return is_air_animal;
    }

    /**
     * Mengembalikan sebuah Point yang berisi lokasi hewan.
     * @return Nilai position.
     */
    public Point GetPosition() {
        return position;
    }

    /**
     * Mengembalikan sebuah karakter untuk proses render.
     * @return Sebuah char yang menandakan Animal
     */
    public char Render() {
        return 'O';
    }
}

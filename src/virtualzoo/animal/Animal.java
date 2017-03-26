package virtualzoo.animal;

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
     * ID unik untuk setiap jenis Animal
     */
    protected int ID;
    /**
     * Banyaknya alat gerak yang dimiliki Animal
     */
    protected int limb_count;
    /**
     * Jenis kulit yang dimiliki Animal
     */
    protected String skin_type;
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
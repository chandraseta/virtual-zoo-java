package virtualzoo.infrastructure;

import java.awt.Point;
import java.util.*;
import virtualzoo.animal.Animal;
import virtualzoo.animal.behavior.AnimalBehavior;
import virtualzoo.animal.behavior.BehaviorWild;


/**
 * Kelas Cage yang memiliki area dan berisi animal
 *
 * @author Felix Limanta - 13515065
 * @version 3.0
 * @since   3.0
 */
class Cage {
    public static final int LAND = 0;
    public static final int WATER = 1;
    public static final int AIR = 2;
    private int type;
    private Set<Point> area;
    private Vector<Animal> animal;
    int nb_animal;

    /**
     * Constructor
     * Menciptakan cage default yaitu dengan habitat darat.
     */
    public Cage() {
        type = LAND;
        nb_animal = 0;
    }

    /**
     * Constructor
     * Menciptakan cage dengan habitat tertentu.
     * @param _type tipe habitat
     */
    public Cage(int _type) {
        type = _type;
        nb_animal = 0;
    }

    /**
     * Menambahkan point P menjadi area dalam cage.
     * @param p Nilai point yang akan ditambahkan.
     */
    public void addPoint(Point p) {
        area.add(p);
    }

    /**
     * Menghilangkan point P dari area dalam cage.
     * @param p Nilai point yang akan dihilangkan.
     */
    public void removePoint(Point p) {
        area.remove(p);
    }

    /**
     * Menambahkan animal ke dalam cage.
     * Akan dicek terlebih dahulu apakah cage sudah penuh.
     * @param a Hewan yang ingin ditambahkan.
     */
    public void addAnimal(Animal a) {
        if (nb_animal < area.size() / 10 * 3) {
            AnimalBehavior behavior = a.getAnimalBehavior();
            behavior.setBehavior();

            if (behavior.getBehavior()) {
                animal.add(a);
                nb_animal++;
            } else {
                boolean placeable = true;
                BehaviorWild wild = (BehaviorWild) behavior;
                for (int i = 0; i < animal.size() && placeable; ++i) {
                    placeable = wild.isEnemy(animal.elementAt(i).getID());
                }
                if (placeable) {
                    animal.add(a);
                    nb_animal++;
                }
            }
        }
    }

    /**
     * @param i Indeks animal yang ingin dikurangi.
     * @return Hewan yang telah dihilangkan.
     */
    public Animal removeAnimal(int i) {
        if (i < animal.size()) {
            Animal a = animal.elementAt(i);
            animal.remove(i);
            nb_animal--;
            return a;
        } else {
            return null;
        }
    }

    /**
     * Menggerakkan semua animal di dalam cage.
     * Akan dicek agar animal tidak keluar dari cage.
     */
    public void moveAnimal() {
        Random randomno = new Random();

        for (int i = 0; i < animal.size(); ++i) {
            int movement = randomno.nextInt(4);
            boolean movement_in_cage;
            int no_of_tries = 0;
            do {
                animal.elementAt(i).move(movement);
                movement_in_cage = area.contains(animal.elementAt(i).getPosition());
                if (!movement_in_cage) {
                    movement = (movement + 2) % 4;
                    animal.elementAt(i).move(movement);
                    movement = (movement + 3) % 4;
                    no_of_tries++;
                }
            } while (!movement_in_cage && no_of_tries < 4);
        }
    }

    /**
     * Getter area cage.
     * @return Set of point yang menyatakan area cage.
     */
    public Set<Point> getArea() {
        return area;
    }

    /**
     * Getter daftar animal.
     * @return Vector of pointer to Animal yang berisi hewan.
     */
    public Vector<Animal> getAnimal() {
        return animal;
    }
}

package virtualzoo.animal.behavior;

import java.util.Set;

/**
 * Kelas BehaviorWild mendefinisikan perilaku hewan liar.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since   3.0
 */
public class BehaviorWild extends AnimalBehavior {
    /**
     * Berisi ID Animal yang tidak bisa disatukan dalam satu kandang dengan
     * objek pengguna.
     */
    private Set<Integer> enemy;

    /**
     * Menetapkan perilaku Animal menjadi liar
     */
    public void SetBehavior() {
        is_wild = true;
    }

    /**
     * Menambahkan Animal yang tidak bisa disatukan dalam satu kandang dengan
     * objek pengguna.
     * @param id Nilai ID Animal yang mau ditambahkan
     */
    public void AddEnemy(int id) {
        enemy.add(id);
    }

    /**
     * Menghapus Animal yang tidak bisa disatukan dalam satu kandang dengan
     * objek pengguna.
     * @param id Nilai ID Animal yang mau dihapus
     */
    public void RemoveEnemy(int id) {
        enemy.remove(id);
    }

    /**
     * Memeriksa apakah Animal bisa disatukan dalam satu kandang dengan objek
     * pengguna atau tidak.
     * @param id Nilai ID Animal yang mau diperiksa
     */
    public boolean IsEnemy(int id) {
        return enemy.contains(id);
    }
}
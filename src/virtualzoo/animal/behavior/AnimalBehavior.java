package virtualzoo.animal.behavior;

import java.util.Set;

/**
 * Kelas AnimalBehavior menentukan perilaku hewan
 * yang ada di dalam Zoo.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public abstract class AnimalBehavior {

  /**
   * Berisi ID Animal yang tidak bisa disatukan dalam satu kandang dengan
   * objek pengguna.
   */
  protected Set<Integer> enemy;

  /**
   * Atribut menentukan apakah perilaku Animal jinak atau liar.
   */
  protected boolean isWild;

  /**
   * Mengembalikan perilaku Animal.
   *
   * @return Nilai is_wild
   */
  public boolean getBehavior() {
    return isWild;
  }

  /**
   * Menetapkan perilaku Animal.
   */
  public abstract void setBehavior();

  /**
   * Menambahkan Animal yang tidak bisa disatukan dalam satu kandang dengan
   * objek pengguna.
   *
   * @param id Nilai ID Animal yang akan ditambahkan.
   */
  public abstract void addEnemy(int id);

  /**
   * Menghapus Animal yang tidak bisa disatukan dalam satu kandang dengan
   * objek pengguna.
   *
   * @param id Nilai ID Animal yang akan dihapus.
   */
  public abstract void removeEnemy(int id);

  /**
   * Memeriksa apakah Animal bisa disatukan dalam satu kandang dengan objek
   * pengguna atau tidak.
   *
   * @param id Nilai ID Animal yang akan diperiksa.
   * @return Nilai true/false Animal dengan ID=id merupakan musuh.
   */
  public abstract boolean isEnemy(int id);
}
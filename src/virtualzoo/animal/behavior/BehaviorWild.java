package virtualzoo.animal.behavior;


/**
 * Kelas BehaviorWild mendefinisikan perilaku hewan liar.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class BehaviorWild extends AnimalBehavior {

  /**
   * Menetapkan perilaku Animal menjadi liar
   */
  public void setBehavior() {
    isWild = true;
  }

  /**
   * Menambahkan Animal yang tidak bisa disatukan dalam satu kandang dengan
   * objek pengguna.
   *
   * @param id Nilai ID Animal yang mau ditambahkan
   */
  public void addEnemy(int id) {
    enemy.add(id);
  }

  /**
   * Menghapus Animal yang tidak bisa disatukan dalam satu kandang dengan
   * objek pengguna.
   *
   * @param id Nilai ID Animal yang mau dihapus
   */
  public void removeEnemy(int id) {
    enemy.remove(id);
  }

  /**
   * Memeriksa apakah Animal bisa disatukan dalam satu kandang dengan objek
   * pengguna atau tidak.
   *
   * @param id Nilai ID Animal yang mau diperiksa.
   * @return Nilai true/false Animal dengan ID=id merupakan musuh.
   */
  public boolean isEnemy(int id) {
    return enemy.contains(id);
  }
}
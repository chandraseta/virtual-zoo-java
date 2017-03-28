package virtualzoo.animal.behavior;

/**
 * Kelas BehaviorTame mendefinisikan perilaku hewan jinak.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class BehaviorTame extends AnimalBehavior {

  /**
   * Constructor
   */
  public BehaviorTame() {
    super();
    isWild = false;
  }

  /**
   * Menambahkan Animal yang tidak bisa disatukan dalam satu kandang dengan
   * objek pengguna.
   *
   * @param id Nilai ID Animal yang mau ditambahkan.
   */
  public void addEnemy(int id) {
  }

  /**
   * Menghapus Animal yang tidak bisa disatukan dalam satu kandang dengan
   * objek pengguna.
   *
   * @param id Nilai ID Animal yang mau dihapus.
   */
  public void removeEnemy(int id) {
  }

  /**
   * Memeriksa apakah Animal bisa disatukan dalam satu kandang dengan objek
   * pengguna atau tidak.
   *
   * @param id Nilai ID Animal yang mau diperiksa.
   * @return Nilai true/false Animal dengan ID=id merupakan musuh.
   */
  public boolean isEnemy(int id) {
    return false;
  }
}

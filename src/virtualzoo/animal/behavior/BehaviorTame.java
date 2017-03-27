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
   * Menetapkan perilaku Animal menjadi jinak
   */
  public void setBehavior() {
    is_wild = false;
  }

  /**
   * Menambahkan Animal yang tidak bisa disatukan dalam satu kandang dengan
   * objek pengguna.
   *
   * @param id Nilai ID Animal yang mau ditambahkan
   */
  public void addEnemy(int id) {
  }

  /**
   * Menghapus Animal yang tidak bisa disatukan dalam satu kandang dengan
   * objek pengguna.
   *
   * @param id Nilai ID Animal yang mau dihapus
   */
  public void removeEnemy(int id) {
  }
}

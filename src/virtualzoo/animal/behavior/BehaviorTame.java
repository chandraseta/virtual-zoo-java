package virtualzoo.animal.behavior;

/**
 * Kelas BehaviorTame mendefinisikan perilaku hewan jinak.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since   3.0
 */

public class BehaviorTame extends AnimalBehavior {
    /**
     * Menetapkan perilaku Animal menjadi jinak
     */
    public void SetBehavior() {
        is_wild = false;
    }
}

package virtualzoo.animal.behavior;

/**
 * Kelas AnimalBehavior menentukan perilaku hewan
 * yang ada di dalam Zoo.
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since   3.0
 */
public abstract class AnimalBehavior {
    /**
     * Atribut menentukan apakah perilaku Animal jinak atau liar.
     */
    protected boolean is_wild;

    /**
     * Mengembalikan perilaku Animal
     * @return Nilai is_wild
     */
    public boolean getBehavior() {
        return is_wild;
    }

    /**
     * Menetapkan perilaku Animal
     */
    public abstract void setBehavior();
}
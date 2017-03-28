package virtualzoo.animal.reptilia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * <p>
 * Kelas KomodoTest mengaplikasikan unit test pada kelas Komodo.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class KomodoTest {

  private Komodo komodo;

  /**
   * Constructor.
   * <p>
   * Membuat Komodo untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat Komodo.
   */
  public KomodoTest(int locX, int locY, int animalWeight) {
    komodo = new Komodo(locX, locY, animalWeight);
  }

  /**
   * <p>
   * Komodo seharusnya memiliki ID = 10.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", komodo.getId(), 10);
  }

  /**
   * <p>
   * Komodo seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) komodo.getPosition().getX(), locX);
    assertEquals("Y matches", (int) komodo.getPosition().getY(), locY);
  }

  /**
   * <p>
   * Komodo seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", komodo.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * Komodo seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior matches", komodo.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Komodo seharusnya merupakan Carnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", komodo.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * Komodo seharusnya merupakan WaterAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type matches", komodo.getLandAnimal());
    assertFalse("Water type matches", komodo.getWaterAnimal());
    assertFalse("Air type matches", komodo.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Komodo.
   * </p>
   */
  @Test
  public void matchInteract() {
    komodo.interact();
  }
}
package virtualzoo.animal.mammalia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * <p>
 * Kelas WolfTest mengaplikasikan unit test pada kelas Wolf.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class WolfTest {

  private Wolf wolf;

  /**
   * Constructor.
   * <p>
   * Membuat Wolf untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat Wolf.
   */
  public WolfTest(int locX, int locY, int animalWeight) {
    wolf = new Wolf(locX, locY, animalWeight);
  }

  /**
   * <p>
   * Wolf seharusnya memiliki ID = 1.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", wolf.getId(), 1);
  }

  /**
   * <p>
   * Wolf seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) wolf.getPosition().getX(), locX);
    assertEquals("Y matches", (int) wolf.getPosition().getY(), locY);
  }

  /**
   * <p>
   * Wolf seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", wolf.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * Wolf seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior matches", wolf.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Wolf seharusnya merupakan Carnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", wolf.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * Wolf seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type matches", wolf.getLandAnimal());
    assertFalse("Water type matches", wolf.getWaterAnimal());
    assertFalse("Air type matches", wolf.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Wolf.
   * </p>
   */
  @Test
  public void matchInteract() {
    wolf.interact();
  }
}
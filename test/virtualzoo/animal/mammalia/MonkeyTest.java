package virtualzoo.animal.mammalia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * <p>
 * Kelas MonkeyTest mengaplikasikan unit test pada kelas Monkey.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class MonkeyTest {

  private Monkey monkey;

  /**
   * Constructor.
   * <p>
   * Membuat Monkey untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat Monkey.
   */
  public MonkeyTest(int locX, int locY, int animalWeight) {
    monkey = new Monkey(locX, locY, animalWeight);
  }

  /**
   * <p>
   * Monkey seharusnya memiliki ID = 5.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", monkey.getId(), 5);
  }

  /**
   * <p>
   * Monkey seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) monkey.getPosition().getX(), locX);
    assertEquals("Y matches", (int) monkey.getPosition().getY(), locY);
  }

  /**
   * <p>
   * Monkey seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", monkey.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * Monkey seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior matches", monkey.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Monkey seharusnya merupakan Omnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", monkey.getAnimalDiet().isOmnivore());
  }

  /**
   * <p>
   * Monkey seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type matches", monkey.getLandAnimal());
    assertFalse("Water type matches", monkey.getWaterAnimal());
    assertFalse("Air type matches", monkey.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Monkey.
   * </p>
   */
  @Test
  public void matchInteract() {
    monkey.interact();
  }
}
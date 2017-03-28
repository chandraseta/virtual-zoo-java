package test.virtualzoo.animal.mammalia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.animal.mammalia.Monkey;

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
   * Before.
   * <p>
   * Membuat Monkey untuk menjalani test.
   * </p>
   */
  @Before
  public void MonkeySetUpTest() {
    monkey = new Monkey(2, 3, 80);
  }

  /**
   * <p>
   * Monkey seharusnya memiliki ID = 5.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", monkey.getId(), 5);
  }

  /**
   * <p>
   * Monkey seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) monkey.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) monkey.getPosition().getY(), 3);
  }

  /**
   * <p>
   * Monkey seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", monkey.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * Monkey seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior does not match", monkey.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Monkey seharusnya merupakan Omnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", monkey.getAnimalDiet().isOmnivore());
  }

  /**
   * <p>
   * Monkey seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type does not match", monkey.getLandAnimal());
    assertFalse("Water type does not match", monkey.getWaterAnimal());
    assertFalse("Air type does not match", monkey.getAirAnimal());
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
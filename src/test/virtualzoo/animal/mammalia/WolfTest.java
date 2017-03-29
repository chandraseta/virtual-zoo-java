package test.virtualzoo.animal.mammalia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.animal.mammalia.Wolf;

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
   * Before.
   * <p>
   * Membuat Wolf untuk menjalani test.
   * </p>
   */
  @Before
  public void wolfSetUpTest() {
    wolf = new Wolf(2, 3, 80);
  }

  /**
   * <p>
   * Wolf seharusnya memiliki ID = 1.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", wolf.getId(), 1);
  }

  /**
   * <p>
   * Wolf seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) wolf.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) wolf.getPosition().getY(), 3);
  }

  /**
   * <p>
   * Wolf seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", wolf.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * Wolf seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior does not match", wolf.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Wolf seharusnya merupakan Carnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", wolf.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * Wolf seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type does not match", wolf.getLandAnimal());
    assertFalse("Water type does not match", wolf.getWaterAnimal());
    assertFalse("Air type does not match", wolf.getAirAnimal());
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
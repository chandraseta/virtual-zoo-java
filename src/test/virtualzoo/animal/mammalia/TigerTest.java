package test.virtualzoo.animal.mammalia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.animal.mammalia.Tiger;

/**
 * <p>
 * Kelas TigerTest mengaplikasikan unit test pada kelas Tiger.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class TigerTest {

  private Tiger tiger;

  /**
   * Before.
   * <p>
   * Membuat Tiger untuk menjalani test.
   * </p>
   */
  @Before
  public void tigerSetUpTest() {
    tiger = new Tiger(2, 3, 80);
  }

  /**
   * <p>
   * Tiger seharusnya memiliki ID = 3.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", tiger.getId(), 3);
  }

  /**
   * <p>
   * Tiger seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) tiger.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) tiger.getPosition().getY(), 3);
  }

  /**
   * <p>
   * Tiger seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", tiger.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * Tiger seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior does not match", tiger.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Tiger seharusnya merupakan Carnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", tiger.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * Tiger seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type does not match", tiger.getLandAnimal());
    assertFalse("Water type does not match", tiger.getWaterAnimal());
    assertFalse("Air type does not match", tiger.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Tiger.
   * </p>
   */
  @Test
  public void matchInteract() {
    tiger.interact();
  }
}
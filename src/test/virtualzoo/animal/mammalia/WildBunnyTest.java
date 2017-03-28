package test.virtualzoo.animal.mammalia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.animal.mammalia.WildBunny;

/**
 * <p>
 * Kelas WildBunnyTest mengaplikasikan unit test pada kelas WildBunny.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class WildBunnyTest {

  private WildBunny wildBunny;

  /**
   * Before.
   * <p>
   * Membuat WildBunny untuk menjalani test.
   * </p>
   */
  @Before
  public void WildBunnySetUpTest() {
    wildBunny = new WildBunny(2, 3, 80);
  }

  /**
   * <p>
   * WildBunny seharusnya memiliki ID = 0.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", wildBunny.getId(), 0);
  }

  /**
   * <p>
   * WildBunny seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) wildBunny.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) wildBunny.getPosition().getY(), 3);
  }

  /**
   * <p>
   * WildBunny seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", wildBunny.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * WildBunny seharusnya merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertTrue("Behavior does not match", wildBunny.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * WildBunny seharusnya merupakan Herbivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", wildBunny.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * WildBunny seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type does not match", wildBunny.getLandAnimal());
    assertFalse("Water type does not match", wildBunny.getWaterAnimal());
    assertFalse("Air type does not match", wildBunny.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas WildBunny.
   * </p>
   */
  @Test
  public void matchInteract() {
    wildBunny.interact();
  }
}
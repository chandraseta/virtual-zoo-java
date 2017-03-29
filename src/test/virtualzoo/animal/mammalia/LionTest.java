package test.virtualzoo.animal.mammalia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.animal.mammalia.Lion;

/**
 * <p>
 * Kelas LionTest mengaplikasikan unit test pada kelas Lion.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class LionTest {

  private Lion lion;

  /**
   * Before.
   * <p>
   * Membuat Lion untuk menjalani test.
   * </p>
   */
  @Before
  public void lionSetUpTest() {
    lion = new Lion(2, 3, 80);
  }

  /**
   * <p>
   * Lion seharusnya memiliki ID = 2.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", lion.getId(), 2);
  }

  /**
   * <p>
   * Lion seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) lion.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) lion.getPosition().getY(), 3);
  }

  /**
   * <p>
   * Lion seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", lion.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * Lion seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior does not match", lion.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Lion seharusnya merupakan Carnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", lion.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * Lion seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type does not match", lion.getLandAnimal());
    assertFalse("Water type does not match", lion.getWaterAnimal());
    assertFalse("Air type does not match", lion.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Lion.
   * </p>
   */
  @Test
  public void matchInteract() {
    lion.interact();
  }
}
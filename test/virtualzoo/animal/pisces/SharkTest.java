package virtualzoo.animal.pisces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * <p>
 * Kelas SharkTest mengaplikasikan unit test pada kelas Shark.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class SharkTest {

  private Shark shark;

  /**
   * Before.
   * <p>
   * Membuat Shark untuk menjalani test.
   * </p>
   */
  @Before
  public void SharkSetUpTest() {
    shark = new Shark(2, 3, 80);
  }

  /**
   * <p>
   * Shark seharusnya memiliki ID = 13.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", shark.getId(), 13);
  }

  /**
   * <p>
   * Shark seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) shark.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) shark.getPosition().getY(), 3);
  }

  /**
   * <p>
   * Shark seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", shark.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * Shark seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior does not match", shark.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Shark seharusnya merupakan Carnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", shark.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * Shark seharusnya merupakan WaterAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertFalse("Land type does not match", shark.getLandAnimal());
    assertTrue("Water type does not match", shark.getWaterAnimal());
    assertFalse("Air type does not match", shark.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Shark.
   * </p>
   */
  @Test
  public void matchInteract() {
    shark.interact();
  }
}
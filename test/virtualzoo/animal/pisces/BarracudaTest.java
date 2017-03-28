package virtualzoo.animal.pisces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * <p>
 * Kelas BarracudaTest mengaplikasikan unit test pada kelas Barracuda.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class BarracudaTest {

  private Barracuda barracuda;

  /**
   * Before.
   * <p>
   * Membuat Barracuda untuk menjalani test.
   * </p>
   */
  @Before
  public void BarracudaSetUpTest() {
    barracuda = new Barracuda(2, 3, 80);
  }

  /**
   * <p>
   * Barracuda seharusnya memiliki ID = 15.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", barracuda.getId(), 15);
  }

  /**
   * <p>
   * Barracuda seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) barracuda.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) barracuda.getPosition().getY(), 3);
  }

  /**
   * <p>
   * Barracuda seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", barracuda.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * Barracuda seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior does not match", barracuda.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Barracuda seharusnya merupakan Carnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", barracuda.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * Barracuda seharusnya merupakan WaterAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertFalse("Land type does not match", barracuda.getLandAnimal());
    assertTrue("Water type does not match", barracuda.getWaterAnimal());
    assertFalse("Air type does not match", barracuda.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Barracuda.
   * </p>
   */
  @Test
  public void matchInteract() {
    barracuda.interact();
  }
}
package test.virtualzoo.animal.pisces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.animal.pisces.Clownfish;

/**
 * <p>
 * Kelas ClownfishTest mengaplikasikan unit test pada kelas Clownfish.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class ClownfishTest {

  private Clownfish clownfish;

  /**
   * Before.
   * <p>
   * Membuat Clownfish untuk menjalani test.
   * </p>
   */
  @Before
  public void ClownfishSetUpTest() {
    clownfish = new Clownfish(2, 3, 80);
  }

  /**
   * <p>
   * Clownfish seharusnya memiliki ID = 14.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", clownfish.getId(), 14);
  }

  /**
   * <p>
   * Clownfish seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) clownfish.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) clownfish.getPosition().getY(), 3);
  }

  /**
   * <p>
   * Clownfish seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", clownfish.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * Clownfish seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior does not match", clownfish.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Clownfish seharusnya merupakan Omnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", clownfish.getAnimalDiet().isOmnivore());
  }

  /**
   * <p>
   * Clownfish seharusnya merupakan WaterAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertFalse("Land type does not match", clownfish.getLandAnimal());
    assertTrue("Water type does not match", clownfish.getWaterAnimal());
    assertFalse("Air type does not match", clownfish.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Clownfish.
   * </p>
   */
  @Test
  public void matchInteract() {
    clownfish.interact();
  }
}
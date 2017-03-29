package test.virtualzoo.animal.aves;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.animal.aves.Eagle;

/**
 * <p>
 * Kelas EagleTest mengaplikasikan unit test pada kelas Eagle.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class EagleTest {

  private Eagle eagle;

  /**
   * Before.
   * <p>
   * Membuat Eagle untuk menjalani test.
   * </p>
   */
  @Before
  public void eagleSetUpTest() {
    eagle = new Eagle(2, 3, 80);
  }

  /**
   * <p>
   * Eagle seharusnya memiliki ID = 17.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", eagle.getId(), 17);
  }

  /**
   * <p>
   * Eagle seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) eagle.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) eagle.getPosition().getY(), 3);
  }

  /**
   * <p>
   * Eagle seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", eagle.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * Eagle seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior does not match", eagle.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Eagle seharusnya merupakan Carnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", eagle.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * Eagle seharusnya merupakan LandAnimal dan AirAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type does not match", eagle.getLandAnimal());
    assertFalse("Water type does not match", eagle.getWaterAnimal());
    assertTrue("Air type does not match", eagle.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Eagle.
   * </p>
   */
  @Test
  public void matchInteract() {
    eagle.interact();
  }
}
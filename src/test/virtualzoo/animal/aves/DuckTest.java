package test.virtualzoo.animal.aves;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.animal.aves.Duck;

/**
 * <p>
 * Kelas DuckTest mengaplikasikan unit test pada kelas Duck.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class DuckTest {
  
  private Duck duck;

  /**
   * Before.
   * <p>
   * Membuat Duck untuk menjalani test.
   * </p>
   */
  @Before
  public void duckSetUpTest() {
    duck = new Duck(2, 3, 80);
  }

  /**
   * <p>
   * Duck seharusnya memiliki ID = 20.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", duck.getId(), 20);
  }

  /**
   * <p>
   * Duck seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) duck.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) duck.getPosition().getY(), 3);
  }

  /**
   * <p>
   * Duck seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", duck.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * Duck seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior does not match", duck.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Duck seharusnya merupakan Omnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", duck.getAnimalDiet().isOmnivore());
  }

  /**
   * <p>
   * Duck seharusnya merupakan LandAnimal, WaterAnimal, dan AirAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type does not match", duck.getLandAnimal());
    assertTrue("Water type does not match", duck.getWaterAnimal());
    assertTrue("Air type does not match", duck.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Duck.
   * </p>
   */
  @Test
  public void matchInteract() {
    duck.interact();
  }
}
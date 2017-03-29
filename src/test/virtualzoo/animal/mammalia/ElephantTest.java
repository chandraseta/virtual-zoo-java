package test.virtualzoo.animal.mammalia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.animal.mammalia.Elephant;

/**
 * <p>
 * Kelas ElephantTest mengaplikasikan unit test pada kelas Elephant.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class ElephantTest {

  private Elephant elephant;

  /**
   * Before.
   * <p>
   * Membuat Elephant untuk menjalani test.
   * </p>
   */
  @Before
  public void elephantSetUpTest() {
    elephant = new Elephant(2, 3, 80);
  }

  /**
   * <p>
   * Elephant seharusnya memiliki ID = 7.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", elephant.getId(), 7);
  }

  /**
   * <p>
   * Elephant seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) elephant.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) elephant.getPosition().getY(), 3);
  }

  /**
   * <p>
   * Elephant seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", elephant.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * Elephant seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior does not match", elephant.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Elephant seharusnya merupakan Herbivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", elephant.getAnimalDiet().isHerbivore());
  }

  /**
   * <p>
   * Elephant seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type does not match", elephant.getLandAnimal());
    assertFalse("Water type does not match", elephant.getWaterAnimal());
    assertFalse("Air type does not match", elephant.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Elephant.
   * </p>
   */
  @Test
  public void matchInteract() {
    elephant.interact();
  }
}
package test.virtualzoo.animal.aves;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.animal.aves.Owl;

/**
 * <p>
 * Kelas OwlTest mengaplikasikan unit test pada kelas Owl.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class OwlTest {

  private Owl owl;

  /**
   * Before.
   * <p>
   * Membuat Owl untuk menjalani test.
   * </p>
   */
  @Before
  public void OwlSetUpTest() {
    owl = new Owl(2, 3, 80);
  }

  /**
   * <p>
   * Owl seharusnya memiliki ID = 16.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", owl.getId(), 16);
  }

  /**
   * <p>
   * Owl seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) owl.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) owl.getPosition().getY(), 3);
  }

  /**
   * <p>
   * Owl seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", owl.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * Owl seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior does not match", owl.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Owl seharusnya merupakan Herbivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", owl.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * Owl seharusnya merupakan LandAnimal dan AirAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type does not match", owl.getLandAnimal());
    assertFalse("Water type does not match", owl.getWaterAnimal());
    assertTrue("Air type does not match", owl.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Owl.
   * </p>
   */
  @Test
  public void matchInteract() {
    owl.interact();
  }
}
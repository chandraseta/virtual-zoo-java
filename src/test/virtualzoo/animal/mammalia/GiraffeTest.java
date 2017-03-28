package test.virtualzoo.animal.mammalia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.animal.mammalia.Giraffe;

/**
 * <p>
 * Kelas GiraffeTest mengaplikasikan unit test pada kelas Giraffe.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class GiraffeTest {

  private Giraffe giraffe;

  /**
   * Before.
   * <p>
   * Membuat Giraffe untuk menjalani test.
   * </p>
   */
  @Before
  public void GiraffeSetUpTest() {
    giraffe = new Giraffe(2, 3, 80);
  }

  /**
   * <p>
   * Giraffe seharusnya memiliki ID = 6.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", giraffe.getId(), 6);
  }

  /**
   * <p>
   * Giraffe seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) giraffe.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) giraffe.getPosition().getY(), 3);
  }

  /**
   * <p>
   * Giraffe seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", giraffe.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * Giraffe seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior does not match", giraffe.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Giraffe seharusnya merupakan Herbivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", giraffe.getAnimalDiet().isHerbivore());
  }

  /**
   * <p>
   * Giraffe seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type does not match", giraffe.getLandAnimal());
    assertFalse("Water type does not match", giraffe.getWaterAnimal());
    assertFalse("Air type does not match", giraffe.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Giraffe.
   * </p>
   */
  @Test
  public void matchInteract() {
    giraffe.interact();
  }
}
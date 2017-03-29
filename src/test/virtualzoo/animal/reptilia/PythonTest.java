package test.virtualzoo.animal.reptilia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.animal.reptilia.Python;

/**
 * <p>
 * Kelas PythonTest mengaplikasikan unit test pada kelas Python.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class PythonTest {

  private Python python;

  /**
   * Before.
   * <p>
   * Membuat Python untuk menjalani test.
   * </p>
   */
  @Before
  public void pythonSetUpTest() {
    python = new Python(2, 3, 80);
  }

  /**
   * <p>
   * Python seharusnya memiliki ID = 9.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", python.getId(), 9);
  }

  /**
   * <p>
   * Python seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) python.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) python.getPosition().getY(), 3);
  }

  /**
   * <p>
   * Python seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", python.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * Python seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior does not match", python.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Python seharusnya merupakan Carnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", python.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * Python seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type does not match", python.getLandAnimal());
    assertFalse("Water type does not match", python.getWaterAnimal());
    assertFalse("Air type does not match", python.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Python.
   * </p>
   */
  @Test
  public void matchInteract() {
    python.interact();
  }
}
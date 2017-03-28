package virtualzoo.animal.reptilia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * <p>
 * Kelas CrocodileTest mengaplikasikan unit test pada kelas Crocodile.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class CrocodileTest {

  private Crocodile crocodile;

  /**
   * Before.
   * <p>
   * Membuat Crocodile untuk menjalani test.
   * </p>
   */
  @Before
  public void CrocodileSetUpTest() {
    crocodile = new Crocodile(2, 3, 80);
  }

  /**
   * <p>
   * Crocodile seharusnya memiliki ID = 8.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", crocodile.getId(), 8);
  }

  /**
   * <p>
   * Crocodile seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) crocodile.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) crocodile.getPosition().getY(), 3);
  }

  /**
   * <p>
   * Crocodile seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", crocodile.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * Crocodile seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior does not match", crocodile.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Crocodile seharusnya merupakan Carnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", crocodile.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * Crocodile seharusnya merupakan LandAnimal dan WaterAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type does not match", crocodile.getLandAnimal());
    assertTrue("Water type does not match", crocodile.getWaterAnimal());
    assertFalse("Air type does not match", crocodile.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Crocodile.
   * </p>
   */
  @Test
  public void matchInteract() {
    crocodile.interact();
  }
}
package virtualzoo.animal.reptilia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * <p>
 * Kelas ChameleonTest mengaplikasikan unit test pada kelas Chameleon.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class ChameleonTest {

  private Chameleon chameleon;

  /**
   * Before.
   * <p>
   * Membuat Chameleon untuk menjalani test.
   * </p>
   */
  @Before
  public void ChameleonSetUpTest() {
    chameleon = new Chameleon(2, 3, 80);
  }

  /**
   * <p>
   * Chameleon seharusnya memiliki ID = 12.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", chameleon.getId(), 12);
  }

  /**
   * <p>
   * Chameleon seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) chameleon.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) chameleon.getPosition().getY(), 3);
  }

  /**
   * <p>
   * Chameleon seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", chameleon.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * Chameleon seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior does not match", chameleon.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Chameleon seharusnya merupakan Omnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", chameleon.getAnimalDiet().isOmnivore());
  }

  /**
   * <p>
   * Chameleon seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type does not match", chameleon.getLandAnimal());
    assertFalse("Water type does not match", chameleon.getWaterAnimal());
    assertFalse("Air type does not match", chameleon.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Chameleon.
   * </p>
   */
  @Test
  public void matchInteract() {
    chameleon.interact();
  }
}
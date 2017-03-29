package test.virtualzoo.animal.aves;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.animal.aves.Peacock;

/**
 * <p>
 * Kelas PeacockTest mengaplikasikan unit test pada kelas Peacock.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class PeacockTest {

  private Peacock peacock;

  /**
   * Before.
   * <p>
   * Membuat Peacock untuk menjalani test.
   * </p>
   */
  @Before
  public void peacockSetUpTest() {
    peacock = new Peacock(2, 3, 80);
  }

  /**
   * <p>
   * Peacock seharusnya memiliki ID = 19.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", peacock.getId(), 19);
  }

  /**
   * <p>
   * Peacock seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) peacock.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) peacock.getPosition().getY(), 3);
  }

  /**
   * <p>
   * Peacock seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", peacock.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * Peacock seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior does not match", peacock.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Peacock seharusnya merupakan Omnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", peacock.getAnimalDiet().isOmnivore());
  }

  /**
   * <p>
   * Peacock seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type does not match", peacock.getLandAnimal());
    assertFalse("Water type does not match", peacock.getWaterAnimal());
    assertFalse("Air type does not match", peacock.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Peacock.
   * </p>
   */
  @Test
  public void matchInteract() {
    peacock.interact();
  }
}
package test.virtualzoo.animal.reptilia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.animal.reptilia.Iguana;

/**
 * <p>
 * Kelas IguanaTest mengaplikasikan unit test pada kelas Iguana.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class IguanaTest {

  private Iguana iguana;

  /**
   * Before.
   * <p>
   * Membuat Iguana untuk menjalani test.
   * </p>
   */
  @Before
  public void IguanaSetUpTest() {
    iguana = new Iguana(2, 3, 80);
  }

  /**
   * <p>
   * Iguana seharusnya memiliki ID = 11.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", iguana.getId(), 11);
  }

  /**
   * <p>
   * Iguana seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) iguana.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) iguana.getPosition().getY(), 3);
  }

  /**
   * <p>
   * Iguana seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", iguana.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * Iguana seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior does not match", iguana.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Iguana seharusnya merupakan Omnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", iguana.getAnimalDiet().isOmnivore());
  }

  /**
   * <p>
   * Iguana seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type does not match", iguana.getLandAnimal());
    assertFalse("Water type does not match", iguana.getWaterAnimal());
    assertFalse("Air type does not match", iguana.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Iguana.
   * </p>
   */
  @Test
  public void matchInteract() {
    iguana.interact();
  }
}
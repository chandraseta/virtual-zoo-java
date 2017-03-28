package virtualzoo.animal.mammalia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * <p>
 * Kelas ZebraTest mengaplikasikan unit test pada kelas Zebra.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class ZebraTest {

  private Zebra zebra;

  /**
   * Before.
   * <p>
   * Membuat Zebra untuk menjalani test.
   * </p>
   */
  @Before
  public void ZebraSetUpTest() {
    zebra = new Zebra(2, 3, 80);
  }

  /**
   * <p>
   * Zebra seharusnya memiliki ID = 4.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", zebra.getId(), 4);
  }

  /**
   * <p>
   * Zebra seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) zebra.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) zebra.getPosition().getY(), 3);
  }

  /**
   * <p>
   * Zebra seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", zebra.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * Zebra seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior does not match", zebra.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Zebra seharusnya merupakan Herbivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", zebra.getAnimalDiet().isHerbivore());
  }

  /**
   * <p>
   * Zebra seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type does not match", zebra.getLandAnimal());
    assertFalse("Water type does not match", zebra.getWaterAnimal());
    assertFalse("Air type does not match", zebra.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Zebra.
   * </p>
   */
  @Test
  public void matchInteract() {
    zebra.interact();
  }
}
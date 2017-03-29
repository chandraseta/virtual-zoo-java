package test.virtualzoo.animal.aves;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.animal.aves.WildColibri;

/**
 * <p>
 * Kelas WildColibriTest mengaplikasikan unit test pada kelas WildColibri.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class WildColibriTest {

  private WildColibri wildColibri;

  /**
   * Before.
   * <p>
   * Membuat WildColibri untuk menjalani test.
   * </p>
   */
  @Before
  public void wildColibriSetUpTest() {
    wildColibri = new WildColibri(2, 3, 80);
  }

  /**
   * <p>
   * WildColibri seharusnya memiliki ID = 21.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", wildColibri.getId(), 21);
  }

  /**
   * <p>
   * WildColibri seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) wildColibri.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) wildColibri.getPosition().getY(), 3);
  }

  /**
   * <p>
   * WildColibri seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", wildColibri.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * WildColibri seharusnya merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertTrue("Behavior does not match", wildColibri.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * WildColibri seharusnya merupakan Herbivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", wildColibri.getAnimalDiet().isHerbivore());
  }

  /**
   * <p>
   * WildColibri seharusnya merupakan LandAnimal dan AirAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type does not match", wildColibri.getLandAnimal());
    assertFalse("Water type does not match", wildColibri.getWaterAnimal());
    assertTrue("Air type does not match", wildColibri.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas WildColibri.
   * </p>
   */
  @Test
  public void matchInteract() {
    wildColibri.interact();
  }
}
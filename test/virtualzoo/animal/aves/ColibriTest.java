package virtualzoo.animal.aves;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * <p>
 * Kelas ColibriTest mengaplikasikan unit test pada kelas Colibri.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class ColibriTest {

  private Colibri colibri;

  /**
   * Before.
   * <p>
   * Membuat Colibri untuk menjalani test.
   * </p>
   */
  @Before
  public void ColibriSetUpTest() {
    colibri = new Colibri(2, 3, 80);
  }

  /**
   * <p>
   * Colibri seharusnya memiliki ID = 18.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", colibri.getId(), 18);
  }

  /**
   * <p>
   * Colibri seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) colibri.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) colibri.getPosition().getY(), 3);
  }

  /**
   * <p>
   * Colibri seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", colibri.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * Colibri seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior does not match", colibri.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Colibri seharusnya merupakan Herbivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", colibri.getAnimalDiet().isHerbivore());
  }

  /**
   * <p>
   * Colibri seharusnya merupakan LandAnimal dan AirAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type does not match", colibri.getLandAnimal());
    assertFalse("Water type does not match", colibri.getWaterAnimal());
    assertTrue("Air type does not match", colibri.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Colibri.
   * </p>
   */
  @Test
  public void matchInteract() {
    colibri.interact();
  }
}
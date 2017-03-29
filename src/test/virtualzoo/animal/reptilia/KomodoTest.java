package test.virtualzoo.animal.reptilia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.animal.reptilia.Komodo;

/**
 * <p>
 * Kelas KomodoTest mengaplikasikan unit test pada kelas Komodo.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class KomodoTest {

  private Komodo komodo;

  /**
   * Before.
   * <p>
   * Membuat Komodo untuk menjalani test.
   * </p>
   */
  @Before
  public void komodoSetUpTest() {
    komodo = new Komodo(2, 3, 80);
  }

  /**
   * <p>
   * Komodo seharusnya memiliki ID = 10.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID does not match", komodo.getId(), 10);
  }

  /**
   * <p>
   * Komodo seharusnya terletak di (2,3) sesuai parameter Before.
   * </p>
   */
  @Test
  public void matchPosition() {
    assertEquals("X does not match", (int) komodo.getPosition().getX(), 2);
    assertEquals("Y does not match", (int) komodo.getPosition().getY(), 3);
  }

  /**
   * <p>
   * Komodo seharusnya memiliki weight sesuai dengan parameter dalam Before.
   * </p>
   */
  @Test
  public void matchWeight() {
    assertEquals("Weight does not match", komodo.getAnimalDiet().getWeight(), 80);
  }

  /**
   * <p>
   * Komodo seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior does not match", komodo.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Komodo seharusnya merupakan Carnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet does not match", komodo.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * Komodo seharusnya merupakan WaterAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type does not match", komodo.getLandAnimal());
    assertFalse("Water type does not match", komodo.getWaterAnimal());
    assertFalse("Air type does not match", komodo.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Komodo.
   * </p>
   */
  @Test
  public void matchInteract() {
    komodo.interact();
  }
}
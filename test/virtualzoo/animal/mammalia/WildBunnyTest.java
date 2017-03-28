package virtualzoo.animal.mammalia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * <p>
 * Kelas WildBunnyTest mengaplikasikan unit test pada kelas WildBunny.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class WildBunnyTest {

  private WildBunny wildBunny;

  /**
   * Constructor.
   * <p>
   * Membuat WildBunny untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat WildBunny.
   */
  public WildBunnyTest(int locX, int locY, int animalWeight) {
    wildBunny = new WildBunny(locX, locY, animalWeight);
  }

  /**
   * <p>
   * WildBunny seharusnya memiliki ID = 0.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", wildBunny.getId(), 0);
  }

  /**
   * <p>
   * WildBunny seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) wildBunny.getPosition().getX(), locX);
    assertEquals("Y matches", (int) wildBunny.getPosition().getY(), locY);
  }

  /**
   * <p>
   * WildBunny seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", wildBunny.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * WildBunny seharusnya merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertTrue("Behavior matches", wildBunny.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * WildBunny seharusnya merupakan Herbivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", wildBunny.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * WildBunny seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type matches", wildBunny.getLandAnimal());
    assertFalse("Water type matches", wildBunny.getWaterAnimal());
    assertTrue("Air type matches", wildBunny.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas WildBunny.
   * </p>
   */
  @Test
  public void matchInteract() {
    wildBunny.interact();
  }
}
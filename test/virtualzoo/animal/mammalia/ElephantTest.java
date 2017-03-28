package virtualzoo.animal.mammalia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import virtualzoo.animal.mammalia.Elephant;

/**
 * <p>
 * Kelas ElephantTest mengaplikasikan unit test pada kelas Elephant.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class ElephantTest {

  private Elephant elephant;

  /**
   * Constructor.
   * <p>
   * Membuat Elephant untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat Elephant.
   */
  public ElephantTest(int locX, int locY, int animalWeight) {
    elephant = new Elephant(locX, locY, animalWeight);
  }

  /**
   * <p>
   * Elephant seharusnya memiliki ID = 7.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", elephant.getId(), 7);
  }

  /**
   * <p>
   * Elephant seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) elephant.getPosition().getX(), locX);
    assertEquals("Y matches", (int) elephant.getPosition().getY(), locY);
  }

  /**
   * <p>
   * Elephant seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", elephant.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * Elephant seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior matches", elephant.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Elephant seharusnya merupakan Herbivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", elephant.getAnimalDiet().isHerbivore());
  }

  /**
   * <p>
   * Elephant seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type matches", elephant.getLandAnimal());
    assertFalse("Water type matches", elephant.getWaterAnimal());
    assertFalse("Air type matches", elephant.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Elephant.
   * </p>
   */
  @Test
  public void matchInteract() {
    elephant.interact();
  }
}
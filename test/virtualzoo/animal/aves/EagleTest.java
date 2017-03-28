package virtualzoo.animal.aves;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import virtualzoo.animal.aves.Eagle;

/**
 * <p>
 * Kelas EagleTest mengaplikasikan unit test pada kelas Eagle.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class EagleTest {

  private Eagle eagle;

  /**
   * Constructor.
   * <p>
   * Membuat Eagle untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat Eagle.
   */
  public EagleTest(int locX, int locY, int animalWeight) {
    eagle = new Eagle(locX, locY, animalWeight);
  }

  /**
   * <p>
   * Eagle seharusnya memiliki ID = 17.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", eagle.getId(), 17);
  }

  /**
   * <p>
   * Eagle seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) eagle.getPosition().getX(), locX);
    assertEquals("Y matches", (int) eagle.getPosition().getY(), locY);
  }

  /**
   * <p>
   * Eagle seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", eagle.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * Eagle seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior matches", eagle.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Eagle seharusnya merupakan Carnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", eagle.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * Eagle seharusnya merupakan LandAnimal dan AirAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type matches", eagle.getLandAnimal());
    assertFalse("Water type matches", eagle.getWaterAnimal());
    assertTrue("Air type matches", eagle.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Eagle.
   * </p>
   */
  @Test
  public void matchInteract() {
    eagle.interact();
  }
}
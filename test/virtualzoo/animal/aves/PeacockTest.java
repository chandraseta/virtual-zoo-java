package virtualzoo.animal.aves;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
   * Constructor.
   * <p>
   * Membuat Peacock untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat Peacock.
   */
  public PeacockTest(int locX, int locY, int animalWeight) {
    peacock = new Peacock(locX, locY, animalWeight);
  }

  /**
   * <p>
   * Peacock seharusnya memiliki ID = 19.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", peacock.getId(), 19);
  }

  /**
   * <p>
   * Peacock seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) peacock.getPosition().getX(), locX);
    assertEquals("Y matches", (int) peacock.getPosition().getY(), locY);
  }

  /**
   * <p>
   * Peacock seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", peacock.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * Peacock seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior matches", peacock.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Peacock seharusnya merupakan Omnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", peacock.getAnimalDiet().isOmnivore());
  }

  /**
   * <p>
   * Peacock seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type matches", peacock.getLandAnimal());
    assertFalse("Water type matches", peacock.getWaterAnimal());
    assertFalse("Air type matches", peacock.getAirAnimal());
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
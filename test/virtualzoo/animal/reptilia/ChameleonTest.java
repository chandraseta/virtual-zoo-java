package virtualzoo.animal.reptilia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * <p>
 * Kelas ChameleonTest mengaplikasikan unit test pada kelas Chameleon.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class ChameleonTest {

  private Chameleon chameleon;

  /**
   * Constructor.
   * <p>
   * Membuat Chameleon untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat Chameleon.
   */
  public ChameleonTest(int locX, int locY, int animalWeight) {
    chameleon = new Chameleon(locX, locY, animalWeight);
  }

  /**
   * <p>
   * Chameleon seharusnya memiliki ID = 12.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", chameleon.getId(), 12);
  }

  /**
   * <p>
   * Chameleon seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) chameleon.getPosition().getX(), locX);
    assertEquals("Y matches", (int) chameleon.getPosition().getY(), locY);
  }

  /**
   * <p>
   * Chameleon seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", chameleon.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * Chameleon seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior matches", chameleon.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Chameleon seharusnya merupakan Omnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", chameleon.getAnimalDiet().isOmnivore());
  }

  /**
   * <p>
   * Chameleon seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type matches", chameleon.getLandAnimal());
    assertFalse("Water type matches", chameleon.getWaterAnimal());
    assertFalse("Air type matches", chameleon.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Chameleon.
   * </p>
   */
  @Test
  public void matchInteract() {
    chameleon.interact();
  }
}
package virtualzoo.animal.reptilia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

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
   * Constructor.
   * <p>
   * Membuat Iguana untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat Iguana.
   */
  public IguanaTest(int locX, int locY, int animalWeight) {
    iguana = new Iguana(locX, locY, animalWeight);
  }

  /**
   * <p>
   * Iguana seharusnya memiliki ID = 11.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", iguana.getId(), 11);
  }

  /**
   * <p>
   * Iguana seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) iguana.getPosition().getX(), locX);
    assertEquals("Y matches", (int) iguana.getPosition().getY(), locY);
  }

  /**
   * <p>
   * Iguana seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", iguana.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * Iguana seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior matches", iguana.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Iguana seharusnya merupakan Omnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", iguana.getAnimalDiet().isOmnivore());
  }

  /**
   * <p>
   * Iguana seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type matches", iguana.getLandAnimal());
    assertFalse("Water type matches", iguana.getWaterAnimal());
    assertFalse("Air type matches", iguana.getAirAnimal());
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
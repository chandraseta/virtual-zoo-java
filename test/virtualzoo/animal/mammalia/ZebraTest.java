package virtualzoo.animal.mammalia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
   * Constructor.
   * <p>
   * Membuat Zebra untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat Zebra.
   */
  public ZebraTest(int locX, int locY, int animalWeight) {
    zebra = new Zebra(locX, locY, animalWeight);
  }

  /**
   * <p>
   * Zebra seharusnya memiliki ID = 4.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", zebra.getId(), 4);
  }

  /**
   * <p>
   * Zebra seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) zebra.getPosition().getX(), locX);
    assertEquals("Y matches", (int) zebra.getPosition().getY(), locY);
  }

  /**
   * <p>
   * Zebra seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", zebra.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * Zebra seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior matches", zebra.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Zebra seharusnya merupakan Herbivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", zebra.getAnimalDiet().isHerbivore());
  }

  /**
   * <p>
   * Zebra seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type matches", zebra.getLandAnimal());
    assertFalse("Water type matches", zebra.getWaterAnimal());
    assertFalse("Air type matches", zebra.getAirAnimal());
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
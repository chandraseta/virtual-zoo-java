package virtualzoo.animal.aves;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
   * Constructor.
   * <p>
   * Membuat WildColibri untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat WildColibri.
   */
  public WildColibriTest(int locX, int locY, int animalWeight) {
    wildColibri = new WildColibri(locX, locY, animalWeight);
  }

  /**
   * <p>
   * WildColibri seharusnya memiliki ID = 18.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", wildColibri.getId(), 18);
  }

  /**
   * <p>
   * WildColibri seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) wildColibri.getPosition().getX(), locX);
    assertEquals("Y matches", (int) wildColibri.getPosition().getY(), locY);
  }

  /**
   * <p>
   * WildColibri seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", wildColibri.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * WildColibri seharusnya merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertTrue("Behavior matches", wildColibri.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * WildColibri seharusnya merupakan Herbivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", wildColibri.getAnimalDiet().isHerbivore());
  }

  /**
   * <p>
   * WildColibri seharusnya merupakan LandAnimal dan AirAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type matches", wildColibri.getLandAnimal());
    assertFalse("Water type matches", wildColibri.getWaterAnimal());
    assertTrue("Air type matches", wildColibri.getAirAnimal());
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
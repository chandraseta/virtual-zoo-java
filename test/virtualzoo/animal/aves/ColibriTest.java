package virtualzoo.animal.aves;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
   * Constructor.
   * <p>
   * Membuat Colibri untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat Colibri.
   */
  public ColibriTest(int locX, int locY, int animalWeight) {
    colibri = new Colibri(locX, locY, animalWeight);
  }

  /**
   * <p>
   * Colibri seharusnya memiliki ID = 18.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", colibri.getId(), 18);
  }

  /**
   * <p>
   * Colibri seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) colibri.getPosition().getX(), locX);
    assertEquals("Y matches", (int) colibri.getPosition().getY(), locY);
  }

  /**
   * <p>
   * Colibri seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", colibri.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * Colibri seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior matches", colibri.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Colibri seharusnya merupakan Herbivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", colibri.getAnimalDiet().isHerbivore());
  }

  /**
   * <p>
   * Colibri seharusnya merupakan LandAnimal dan AirAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type matches", colibri.getLandAnimal());
    assertFalse("Water type matches", colibri.getWaterAnimal());
    assertTrue("Air type matches", colibri.getAirAnimal());
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
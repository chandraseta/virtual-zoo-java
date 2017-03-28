package virtualzoo.animal.reptilia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * <p>
 * Kelas CrocodileTest mengaplikasikan unit test pada kelas Crocodile.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class CrocodileTest {

  private Crocodile crocodile;

  /**
   * Constructor.
   * <p>
   * Membuat Crocodile untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat Crocodile.
   */
  public CrocodileTest(int locX, int locY, int animalWeight) {
    crocodile = new Crocodile(locX, locY, animalWeight);
  }

  /**
   * <p>
   * Crocodile seharusnya memiliki ID = 8.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", crocodile.getId(), 8);
  }

  /**
   * <p>
   * Crocodile seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) crocodile.getPosition().getX(), locX);
    assertEquals("Y matches", (int) crocodile.getPosition().getY(), locY);
  }

  /**
   * <p>
   * Crocodile seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", crocodile.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * Crocodile seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior matches", crocodile.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Crocodile seharusnya merupakan Carnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", crocodile.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * Crocodile seharusnya merupakan LandAnimal dan WaterAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type matches", crocodile.getLandAnimal());
    assertTrue("Water type matches", crocodile.getWaterAnimal());
    assertFalse("Air type matches", crocodile.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Crocodile.
   * </p>
   */
  @Test
  public void matchInteract() {
    crocodile.interact();
  }
}
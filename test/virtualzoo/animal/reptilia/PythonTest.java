package virtualzoo.animal.reptilia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * <p>
 * Kelas PythonTest mengaplikasikan unit test pada kelas Python.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class PythonTest {

  private Python python;

  /**
   * Constructor.
   * <p>
   * Membuat Python untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat Python.
   */
  public PythonTest(int locX, int locY, int animalWeight) {
    python = new Python(locX, locY, animalWeight);
  }

  /**
   * <p>
   * Python seharusnya memiliki ID = 9.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", python.getId(), 9);
  }

  /**
   * <p>
   * Python seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) python.getPosition().getX(), locX);
    assertEquals("Y matches", (int) python.getPosition().getY(), locY);
  }

  /**
   * <p>
   * Python seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", python.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * Python seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior matches", python.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Python seharusnya merupakan Carnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", python.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * Python seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type matches", python.getLandAnimal());
    assertFalse("Water type matches", python.getWaterAnimal());
    assertFalse("Air type matches", python.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Python.
   * </p>
   */
  @Test
  public void matchInteract() {
    python.interact();
  }
}
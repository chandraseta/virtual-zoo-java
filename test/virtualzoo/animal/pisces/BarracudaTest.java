package virtualzoo.animal.pisces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * <p>
 * Kelas BarracudaTest mengaplikasikan unit test pada kelas Barracuda.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class BarracudaTest {

  private Barracuda barracuda;

  /**
   * Constructor.
   * <p>
   * Membuat Barracuda untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat Barracuda.
   */
  public BarracudaTest(int locX, int locY, int animalWeight) {
    barracuda = new Barracuda(locX, locY, animalWeight);
  }

  /**
   * <p>
   * Barracuda seharusnya memiliki ID = 15.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", barracuda.getId(), 15);
  }

  /**
   * <p>
   * Barracuda seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) barracuda.getPosition().getX(), locX);
    assertEquals("Y matches", (int) barracuda.getPosition().getY(), locY);
  }

  /**
   * <p>
   * Barracuda seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", barracuda.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * Barracuda seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior matches", barracuda.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Barracuda seharusnya merupakan Carnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", barracuda.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * Barracuda seharusnya merupakan WaterAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertFalse("Land type matches", barracuda.getLandAnimal());
    assertTrue("Water type matches", barracuda.getWaterAnimal());
    assertFalse("Air type matches", barracuda.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Barracuda.
   * </p>
   */
  @Test
  public void matchInteract() {
    barracuda.interact();
  }
}
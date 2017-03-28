package virtualzoo.animal.pisces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * <p>
 * Kelas SharkTest mengaplikasikan unit test pada kelas Shark.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class SharkTest {

  private Shark shark;

  /**
   * Constructor.
   * <p>
   * Membuat Shark untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat Shark.
   */
  public SharkTest(int locX, int locY, int animalWeight) {
    shark = new Shark(locX, locY, animalWeight);
  }

  /**
   * <p>
   * Shark seharusnya memiliki ID = 13.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", shark.getId(), 13);
  }

  /**
   * <p>
   * Shark seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) shark.getPosition().getX(), locX);
    assertEquals("Y matches", (int) shark.getPosition().getY(), locY);
  }

  /**
   * <p>
   * Shark seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", shark.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * Shark seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior matches", shark.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Shark seharusnya merupakan Carnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", shark.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * Shark seharusnya merupakan WaterAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertFalse("Land type matches", shark.getLandAnimal());
    assertTrue("Water type matches", shark.getWaterAnimal());
    assertFalse("Air type matches", shark.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Shark.
   * </p>
   */
  @Test
  public void matchInteract() {
    shark.interact();
  }
}
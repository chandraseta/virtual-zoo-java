package virtualzoo.animal.pisces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * <p>
 * Kelas ClownfishTest mengaplikasikan unit test pada kelas Clownfish.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class ClownfishTest {

  private Clownfish clownfish;

  /**
   * Constructor.
   * <p>
   * Membuat Clownfish untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat Clownfish.
   */
  public ClownfishTest(int locX, int locY, int animalWeight) {
    clownfish = new Clownfish(locX, locY, animalWeight);
  }

  /**
   * <p>
   * Clownfish seharusnya memiliki ID = 14.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", clownfish.getId(), 14);
  }

  /**
   * <p>
   * Clownfish seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) clownfish.getPosition().getX(), locX);
    assertEquals("Y matches", (int) clownfish.getPosition().getY(), locY);
  }

  /**
   * <p>
   * Clownfish seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", clownfish.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * Clownfish seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior matches", clownfish.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Clownfish seharusnya merupakan Omnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", clownfish.getAnimalDiet().isOmnivore());
  }

  /**
   * <p>
   * Clownfish seharusnya merupakan WaterAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertFalse("Land type matches", clownfish.getLandAnimal());
    assertTrue("Water type matches", clownfish.getWaterAnimal());
    assertFalse("Air type matches", clownfish.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Clownfish.
   * </p>
   */
  @Test
  public void matchInteract() {
    clownfish.interact();
  }
}
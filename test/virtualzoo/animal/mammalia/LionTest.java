package virtualzoo.animal.mammalia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import virtualzoo.animal.mammalia.Lion;

/**
 * <p>
 * Kelas LionTest mengaplikasikan unit test pada kelas Lion.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class LionTest {

  private Lion lion;

  /**
   * Constructor.
   * <p>
   * Membuat Lion untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat Lion.
   */
  public LionTest(int locX, int locY, int animalWeight) {
    lion = new Lion(locX, locY, animalWeight);
  }

  /**
   * <p>
   * Lion seharusnya memiliki ID = 2.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", lion.getId(), 2);
  }

  /**
   * <p>
   * Lion seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) lion.getPosition().getX(), locX);
    assertEquals("Y matches", (int) lion.getPosition().getY(), locY);
  }

  /**
   * <p>
   * Lion seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", lion.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * Lion seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior matches", lion.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Lion seharusnya merupakan Carnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", lion.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * Lion seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type matches", lion.getLandAnimal());
    assertFalse("Water type matches", lion.getWaterAnimal());
    assertFalse("Air type matches", lion.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Lion.
   * </p>
   */
  @Test
  public void matchInteract() {
    lion.interact();
  }
}
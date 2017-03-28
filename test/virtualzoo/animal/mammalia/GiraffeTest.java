package virtualzoo.animal.mammalia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import virtualzoo.animal.mammalia.Giraffe;

/**
 * <p>
 * Kelas GiraffeTest mengaplikasikan unit test pada kelas Giraffe.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class GiraffeTest {

  private Giraffe giraffe;

  /**
   * Constructor.
   * <p>
   * Membuat Giraffe untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat Giraffe.
   */
  public GiraffeTest(int locX, int locY, int animalWeight) {
    giraffe = new Giraffe(locX, locY, animalWeight);
  }

  /**
   * <p>
   * Giraffe seharusnya memiliki ID = 6.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", giraffe.getId(), 6);
  }

  /**
   * <p>
   * Giraffe seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) giraffe.getPosition().getX(), locX);
    assertEquals("Y matches", (int) giraffe.getPosition().getY(), locY);
  }

  /**
   * <p>
   * Giraffe seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", giraffe.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * Giraffe seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior matches", giraffe.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Giraffe seharusnya merupakan Herbivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", giraffe.getAnimalDiet().isHerbivore());
  }

  /**
   * <p>
   * Giraffe seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type matches", giraffe.getLandAnimal());
    assertFalse("Water type matches", giraffe.getWaterAnimal());
    assertFalse("Air type matches", giraffe.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Giraffe.
   * </p>
   */
  @Test
  public void matchInteract() {
    giraffe.interact();
  }
}
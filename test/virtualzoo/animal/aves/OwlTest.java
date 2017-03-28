package virtualzoo.animal.aves;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import virtualzoo.animal.aves.Owl;

/**
 * <p>
 * Kelas OwlTest mengaplikasikan unit test pada kelas Owl.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class OwlTest {

  private Owl owl;

  /**
   * Constructor.
   * <p>
   * Membuat Owl untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat Owl.
   */
  public OwlTest(int locX, int locY, int animalWeight) {
    owl = new Owl(locX, locY, animalWeight);
  }

  /**
   * <p>
   * Owl seharusnya memiliki ID = 16.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", owl.getId(), 16);
  }

  /**
   * <p>
   * Owl seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) owl.getPosition().getX(), locX);
    assertEquals("Y matches", (int) owl.getPosition().getY(), locY);
  }

  /**
   * <p>
   * Owl seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", owl.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * Owl seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior matches", owl.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Owl seharusnya merupakan Herbivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", owl.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * Owl seharusnya merupakan LandAnimal dan AirAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type matches", owl.getLandAnimal());
    assertFalse("Water type matches", owl.getWaterAnimal());
    assertTrue("Air type matches", owl.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Owl.
   * </p>
   */
  @Test
  public void matchInteract() {
    owl.interact();
  }
}
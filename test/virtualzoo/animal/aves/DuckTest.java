package virtualzoo.animal.aves;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import virtualzoo.animal.aves.Duck;

/**
 * <p>
 * Kelas DuckTest mengaplikasikan unit test pada kelas Duck.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class DuckTest {
  
  private Duck duck;

  /**
   * Constructor.
   * <p>
   * Membuat Duck untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat Duck.
   */
  public DuckTest(int locX, int locY, int animalWeight) {
    duck = new Duck(locX, locY, animalWeight);
  }

  /**
   * <p>
   * Duck seharusnya memiliki ID = 20.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", duck.getId(), 20);
  }

  /**
   * <p>
   * Duck seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) duck.getPosition().getX(), locX);
    assertEquals("Y matches", (int) duck.getPosition().getY(), locY);
  }

  /**
   * <p>
   * Duck seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", duck.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * Duck seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior matches", duck.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Duck seharusnya merupakan Omnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", duck.getAnimalDiet().isOmnivore());
  }

  /**
   * <p>
   * Duck seharusnya merupakan LandAnimal, WaterAnimal, dan AirAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type matches", duck.getLandAnimal());
    assertTrue("Water type matches", duck.getWaterAnimal());
    assertTrue("Air type matches", duck.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Duck.
   * </p>
   */
  @Test
  public void matchInteract() {
    duck.interact();
  }
}
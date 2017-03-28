package virtualzoo.animal.mammalia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import virtualzoo.animal.mammalia.Tiger;

/**
 * <p>
 * Kelas TigerTest mengaplikasikan unit test pada kelas Tiger.
 * </p>
 *
 * @author Holy Lovenia - 13515113
 * @version 3.0
 * @since 3.0
 */
public class TigerTest {

  private Tiger tiger;

  /**
   * Constructor.
   * <p>
   * Membuat Tiger untuk menjalani test.
   * </p>
   * @param locX Nilai absis posisi.
   * @param locY Nilai ordinat posisi.
   * @param animalWeight Nilai berat Tiger.
   */
  public TigerTest(int locX, int locY, int animalWeight) {
    tiger = new Tiger(locX, locY, animalWeight);
  }

  /**
   * <p>
   * Tiger seharusnya memiliki ID = 18.
   * </p>
   */
  @Test
  public void matchId() {
    assertEquals("ID matches", tiger.getId(), 18);
  }

  /**
   * <p>
   * Tiger seharusnya terletak di (locX,locY) sesuai parameter constructor.
   * </p>
   * @param locX Koordinat x.
   * @param locY Koordinat y.
   */
  @Test
  public void matchPosition(int locX, int locY) {
    assertEquals("X matches", (int) tiger.getPosition().getX(), locX);
    assertEquals("Y matches", (int) tiger.getPosition().getY(), locY);
  }

  /**
   * <p>
   * Tiger seharusnya memiliki weight sesuai dengan parameter dalam constructor.
   * </p>
   * @param animalWeight Berat badan Animal.
   */
  @Test
  public void matchWeight(int animalWeight) {
    assertEquals("Weight matches", tiger.getAnimalDiet().getWeight(), animalWeight);
  }

  /**
   * <p>
   * Tiger seharusnya bukan merupakan wild Animal.
   * </p>
   */
  @Test
  public void matchBehavior() {
    assertFalse("Behavior matches", tiger.getAnimalBehavior().getBehavior());
  }

  /**
   * <p>
   * Tiger seharusnya merupakan Carnivora.
   * </p>
   */
  @Test
  public void matchDiet() {
    assertTrue("Diet matches", tiger.getAnimalDiet().isCarnivore());
  }

  /**
   * <p>
   * Tiger seharusnya merupakan LandAnimal.
   * </p>
   */
  @Test
  public void matchType() {
    assertTrue("Land type matches", tiger.getLandAnimal());
    assertFalse("Water type matches", tiger.getWaterAnimal());
    assertFalse("Air type matches", tiger.getAirAnimal());
  }

  /**
   * <p>
   * Test method interact() dari kelas Tiger.
   * </p>
   */
  @Test
  public void matchInteract() {
    tiger.interact();
  }
}
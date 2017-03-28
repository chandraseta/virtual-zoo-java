package test.virtualzoo.infrastructure.habitat;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.infrastructure.habitat.WaterHabitat;

/**
 * <p>
 * Kelas WaterHabitatTest mengaplikasikan unit test pada kelas WaterHabitat.
 * </p>
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since 3.0
 */
public class WaterHabitatTest {
  /**
   * <p>
   * Inisialisasi sebuah WaterHabitat.
   * </p>
   */
  private WaterHabitat waterHabitat;

  /**
   * <p>
   * Inisialisasi objek WaterHabitat yang akan diujikan.
   * </p>
   */
  @Before
  public void setUp() {
    waterHabitat = new WaterHabitat();
  }

  /**
   * <p>
   * WaterHabitat tidak dapat diakses pengunjung.
   * </p>
   */
  @Test
  public void matchAccessible() {
    assertEquals("WaterHabitat isn't accessible ", false, waterHabitat.isAccessible());
  }

  /**
   * <p>
   * Char render untuk WaterHabitat sesuai.
   * </p>
   */
  @Test
  public void matchRender() {
    assertEquals("Render character : w ", 'w', waterHabitat.render());
  }

}

package test.virtualzoo.infrastructure.habitat;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.infrastructure.habitat.LandHabitat;

/**
 * <p>
 * Kelas LandHabitatTest mengaplikasikan unit test pada kelas LandHabitat.
 * </p>
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since 3.0
 */
public class LandHabitatTest {

  /**
   * <p>
   * Inisialisasi sebuah LandHabitat.
   * </p>
   */
  private LandHabitat landHabitat;

  /**
   * <p>
   * Inisialisasi objek LandHabitat yang akan diujikan.
   * </p>
   */
  @Before
  public void setUp() {
    landHabitat = new LandHabitat();
  }

  /**
   * <p>
   * LandHabitat tidak dapat diakses pengunjung.
   * </p>
   */
  @Test
  public void matchAccessible() {
    assertEquals("LandHabitat isn't accessible ", false, landHabitat.isAccessible());
  }

  /**
   * <p>
   * Char render untuk LandHabitat sesuai.
   * </p>
   */
  @Test
  public void matchRender() {
    assertEquals("Render character : l ", 'l', landHabitat.render());
  }
}

package test.virtualzoo.infrastructure.habitat;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.infrastructure.habitat.AirHabitat;

/**
 * <p>
 * Kelas AirHabitatTest mengaplikasikan unit test pada kelas AirHabitat.
 * </p>
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since 3.0
 */
public class AirHabitatTest {
  /**
   * <p>
   * Inisialisasi sebuah AirHabitat.
   * </p>
   */
  private AirHabitat airHabitat;

  /**
   * <p>
   * Inisialisasi objek AirHabitat yang akan diujikan.
   * </p>
   */
  @Before
  public void setUp() {
    airHabitat = new AirHabitat();
  }

  /**
   * <p>
   * AirHabitat tidak dapat diakses pengunjung.
   * </p>
   */
  @Test
  public void matchAccessible() {
    assertEquals("AirHabitat isn't accessible ", false, airHabitat.isAccessible());
  }

  /**
   * <p>
   * Char render untuk AirHabitat sesuai.
   * </p>
   */
  @Test
  public void matchRender() {
    assertEquals("Render character : a ", 'a', airHabitat.render());
  }

}
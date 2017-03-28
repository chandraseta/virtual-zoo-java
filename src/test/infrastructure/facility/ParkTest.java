package test.infrastructure.facility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.infrastructure.facility.Park;

/**
 * <p>
 * Kelas ParkTest mengaplikasikan unit test pada kelas Park.
 * </p>
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since 3.0
 */
public class ParkTest {

  /**
   * <p>
   * Inisialisasi Park.
   * </p>
   */
  private Park park1;
  private Park park2;

  /**
   * <p>
   * Inisialisasi objek Park yang akan diujikan.
   * </p>
   */
  @Before
  public void setUp() {
    park1 = new Park(true, "Eden");
    park2 = new Park(false, "Eden");
  }

  /**
   * <p>
   * Getter accessible pada park berjalan dengan semestinya.
   * </p>
   */
  @Test
  public void matchAccessible() {
    assertEquals("Accessible Park", true, park1.isAccessible());
    assertEquals("Not Accessible Park", false, park2.isAccessible());
  }

  /**
   * <p>
   * Nama Park sesuai dengan atribut name-nya.
   * </p>
   */
  @Test
  public void showName() {
    assertEquals("Eden Park", "Eden", park1.getParkName());
  }

  /**
   * <p>
   * Char render untuk Park sesuai.
   * </p>
   */
  @Test
  public void matchRender() {
    assertEquals("Render character : * ", '*', park1.render());
    assertEquals("Render character : * ", '*', park2.render());
  }
}

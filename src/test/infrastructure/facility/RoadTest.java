package test.infrastructure.facility;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.infrastructure.facility.Road;

/**
 * <p>
 * Kelas RoadTest mengaplikasikan unit test pada kelas Road.
 * </p>
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since 3.0
 */
public class RoadTest {

  /**
   * <p>
   * Inisialisasi sebuah Road.
   * </p>
   */
  private Road road1;
  private Road road2;

  /**
   * <p>
   * Inisialisasi objek Road yang akan diujikan.
   * </p>
   */
  @Before
  public void setUp() {
    road1 = new Road(true);
    road2 = new Road(false);
  }

  /**
   * <p>
   * Getter accessible pada road berjalan dengan semestinya.
   * </p>
   */
  @Test
  public void matchAccessible() {
    assertEquals("Road is accessible", true, road1.isAccessible());
    assertEquals("Road is accessible", false, road2.isAccessible());
  }

  /**
   * <p>
   * Char render untuk Road sesuai.
   * </p>
   */
  @Test
  public void matchRender() {
    assertEquals("Render character = . ", '.', road1.render());
    assertEquals("Render character = . ", '.', road2.render());
  }

  /**
   * <p>
   * Road bukan merupakan jalan masuk.
   * </p>
   */
  @Test
  public void matchIsEntrance() {
    assertFalse("Not an Entrance", road1.isEntrance());
    assertFalse("Not an Entrance", road2.isEntrance());
  }

  /**
   * <p>
   * Road bukan merupakan jalan keluar.
   * </p>
   */
  @Test
  public void matchIsExit() {
    assertFalse("Not an Exit", road1.isExit());
    assertFalse("Not an Exit", road2.isExit());
  }
}

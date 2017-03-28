package test.virtualzoo.infrastructure.facility;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.infrastructure.facility.RoadExit;

/**
 * <p>
 * Kelas RoadExitTest mengaplikasikan unit test pada kelas RoadExit.
 * </p>
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since 3.0
 */
public class RoadExitTest {

  /**
   * <p>
   * Inisialisasi RoadExit.
   * </p>
   */
  private RoadExit roadExit1;
  private RoadExit roadExit2;

  /**
   * <p>
   * Inisialisasi objek RoadExit yang akan diujikan.
   * </p>
   */
  @Before
  public void setUp() {
    roadExit1 = new RoadExit(true);
    roadExit2 = new RoadExit(false);
  }

  /**
   * <p>
   * RoadExit bukan merupakan jalan masuk.
   * </p>
   */
  @Test
  public void matchIsEntrance() {
    assertFalse("Not an Entrance : ", roadExit1.isEntrance());
    assertFalse("Not an Entrance : ", roadExit2.isEntrance());
  }

  /**
   * <p>
   * RoadExit merupakan jalan keluar.
   * </p>
   */
  @Test
  public void matchIsExit() {
    assertTrue("An Exit : ", roadExit1.isExit());
    assertTrue("An Exit : ", roadExit2.isExit());
  }
}
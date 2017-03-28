package test.infrastructure.facility;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.infrastructure.facility.RoadEntrance;

/**
 * <p>
 * Kelas RoadEntranceTest mengaplikasikan unit test pada kelas RoadEntrance.
 * </p>
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since 3.0
 */
public class RoadEntranceTest {

  /**
   * <p>
   * Inisialisasi RoadEntrance.
   * </p>
   */
  private RoadEntrance roadEntrance1;
  private RoadEntrance roadEntrance2;

  /**
   * <p>
   * Inisialisasi objek Restaurant yang akan diujikan.
   * </p>
   */
  @Before
  public void setUp() {
    roadEntrance1 = new RoadEntrance(false);
    roadEntrance2 = new RoadEntrance(true);
  }


  /**
   * <p>
   * RoadEntrance merupakan jalan masuk.
   * </p>
   */
  @Test
  public void matchIsEntrance() {
    assertTrue("An Entrance", roadEntrance1.isEntrance());
    assertTrue("An Entrance", roadEntrance2.isEntrance());
  }

  /**
   * <p>
   * RoadEntrance bukan merupakan jalan keluar.
   * </p>
   */
  @Test
  public void matchIsExit() {
    assertFalse("Not an Exit", roadEntrance1.isExit());
    assertFalse("Not an Exit", roadEntrance2.isExit());
  }
}

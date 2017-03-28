package test.virtualzoo.infrastructure.facility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import virtualzoo.infrastructure.facility.Restaurant;

/**
 * <p>
 * Kelas RestaurantTest mengaplikasikan unit test pada kelas Restaurant.
 * </p>
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since 3.0
 */
public class RestaurantTest {

  /**
   * <p>
   * Inisialisasi Restaurant.
   * </p>
   */
  private Restaurant restaurant1;
  private Restaurant restaurant2;

  /**
   * <p>
   * Inisialisasi objek Restaurant yang akan diujikan.
   * </p>
   */
  @Before
  public void setUp() {
    restaurant1 = new Restaurant(true, "Queens");
    restaurant2 = new Restaurant(false, "Queens");
  }

  /**
   * <p>
   * Getter accessible pada restaurant berjalan dengan semestinya.
   * </p>
   */
  @Test
  public void matchAccessible() {
    assertEquals("Accessible Restaurant ", true, restaurant1.isAccessible());
    assertEquals("Not Accessible Restaurant ", false, restaurant2.isAccessible());
  }

  /**
   * <p>
   * Nama Restaurant sesuai dengan atribut name-nya.
   * </p>
   */
  @Test
  public void showName() {
    assertEquals("Queens' Restaurant ", "Queens", restaurant1.getRestaurantName());
  }

  /**
   * <p>
   * Char render untuk Restaurant sesuai.
   * </p>
   */
  @Test
  public void matchRender() {
    assertEquals("Render character : R ", 'R', restaurant1.render());
  }
}
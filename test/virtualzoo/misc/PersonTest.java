package virtualzoo.misc;

import static org.junit.Assert.assertEquals;

import java.awt.Point;
import org.junit.Before;
import org.junit.Test;
/**
 * <p>
 * Kelas PersonTest mengaplikasikan unit test pada kelas Person.
 * </p>
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since 3.0
 */
public class PersonTest {

  /**
   * <p>
   * Inisialisasi Person.
   * </p>
   */
  private Person person1;
  private Person person2;

  /**
   * <p>
   * Inisialisasi objek Person yang akan diujikan.
   * </p>
   */
  @Before
  public void setUp() {
    person1 = new Person();
    person2 = new Person();
  }

  /**
   * <p>
   * Inisialisasi objek Person menghasilkan x = -1 dan y = -1.
   * </p>
   */
  @Test
  public void matchInitialization() {
    Point P = new Point(-1,-1);
    assertEquals("Inisialisasi sukses",P,person1.getPosition());
  }

  /**
   * <p>
   * Set Position berjalan sesuai dengan yang semestinya
   * </p>
   */
  @Test
  public void setterProcedure() {
    Point P = new Point(1,1);
    person1.setPosition(P);
    person2.setPosition(1,1);
    assertEquals("Setter sesuai",P,person1.getPosition());
    assertEquals("Setter sesuai",P,person2.getPosition());
    person1.resetPosition();
    person2.resetPosition();
  }

  /**
   * <p>
   * Char render pada Person dalam Zoo sesuai dengan yang semestinya
   * </p>
   */
  @Test
  public void matchRender() {
    assertEquals("Render Person : ? ",'?',person1.render());
  }

  /**
   * <p>
   * Movement pada Person sudah sesuai dengan prosedur semestinya
   * </p>
   */
  @Test
  public void matchMovement() {
    Point P = new Point(-1,-2);
    person1.move(0);
    assertEquals("Movement 0 (up) y -= 1",P,person1.getPosition());
    P.setLocation(0,-2);
    person1.move(1);
    assertEquals("Movement 1 (right) x += 1",P,person1.getPosition());
    P.setLocation(0,-1);
    person1.move(2);
    assertEquals("Movement 2 (down) y += 1",P,person1.getPosition());
    P.setLocation(-1,-1);
    person1.move(3);
    assertEquals("Movement 3 (left) x -= 1",P,person1.getPosition());
  }

  /**
   * <p>
   * Reset position mengubah posisi pengunjung ke koordinat (-1,-1)
   * </p>
   */
  @Test
  public void matchReset() {
    Point P = new Point(-1,-1);
    person1.setPosition(20,20);
    person1.resetPosition();
    assertEquals("Reset sukses",P,person1.getPosition());
  }
}

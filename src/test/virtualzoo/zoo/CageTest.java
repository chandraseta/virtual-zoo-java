package test.virtualzoo.zoo;

import static org.junit.Assert.assertEquals;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import org.junit.Before;
import org.junit.Test;
import virtualzoo.animal.Animal;
import virtualzoo.animal.aves.Colibri;
import virtualzoo.animal.aves.Duck;
import virtualzoo.zoo.Cage;

/**
 * <p>
 * Kelas CageTest mengaplikasikan unit test pada kelas Cage.
 * </p>
 *
 * @author Oktavianus Handika - 13515035
 * @version 3.0
 * @since 3.0
 */
public class CageTest {
  /**
   * <p>
   * Inisialisasi Cage.
   * </p>
   */
  private Cage cage1;
  private Cage cage2;

  /**
   * <p>
   * Inisialisasi objek Cage yang akan diujikan.
   * </p>
   */
  @Before
  public void setUp() {
    cage1 = new Cage();
    cage2 = new Cage(1);
  }

  /**
   * <p>
   * Prosedur Add dan Remove Point sesuai
   * </p>
   */
  @Test
  public void addAndRemovePoint() {
    Point P1 = new Point (1,2);
    Point P2 = new Point (2,2);
    Point P3 = new Point (2,3);
    cage1.addPoint(P1);
    cage1.addPoint(P2);
    cage1.addPoint(P3);
    Set<Point> pointSet = new HashSet<Point>() {{
      add(P1);
      add(P2);
      add(P3);
    }};
    assertEquals("Area sama (setelah prosedur Add)",pointSet,cage1.getArea());
    cage1.removePoint(P1);
    cage1.removePoint(P2);
    cage1.removePoint(P3);
    pointSet.remove(P1);
    pointSet.remove(P2);
    pointSet.remove(P3);
    assertEquals("Area sama (setelah prosedur Remove",pointSet,cage1.getArea());
  }

  /**
   * <p>
   * Prosedur Add dan Remove Animal sesuai
   * </p>
   */
  @Test
  public void addAndRemoveAnimal() {
    Point P11 = new Point (1,1);
    Point P12 = new Point (1,2);
    Point P13 = new Point (1,3);
    Point P14 = new Point (1,4);
    Point P21 = new Point (2,1);
    Point P22 = new Point (2,2);
    Point P23 = new Point (2,3);
    Point P24 = new Point (2,4);
    cage2.addPoint(P11);
    cage2.addPoint(P12);
    cage2.addPoint(P13);
    cage2.addPoint(P14);
    cage2.addPoint(P21);
    cage2.addPoint(P22);
    cage2.addPoint(P23);
    cage2.addPoint(P24);
    Colibri A1 = new Colibri (1,1,50);
    Duck A2 = new Duck (2,4,30);
    Vector<Animal> vectorAnimal = new Vector<Animal>(50);
    vectorAnimal.add(A1);
    vectorAnimal.add(A2);
    cage2.addAnimal(A1);
    cage2.addAnimal(A2);
    assertEquals("Animal sama (setelah prosedur Add)",vectorAnimal,cage2.getAnimal());
    cage2.removeAnimal(18);
    cage2.removeAnimal(20);
    vectorAnimal.remove(A1);
    vectorAnimal.remove(A2);
    assertEquals("Animal sama (setelah prosedur Remove)",vectorAnimal,cage2.getAnimal());
  }
}

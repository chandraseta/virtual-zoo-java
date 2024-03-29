package virtualzoo.misc;

import java.awt.Point;

/**
 * Kelas Person memiliki person yang dapat melakukan tour dalam zoo.
 *
 * @author Felix Limanta - 13515065
 * @version 3.0
 * @since 3.0
 */
public class Person implements Renderable {

  private Point position;

  /**
   * Constructor
   * Menciptakan person default pada posisi (-1,-1).
   */
  public Person() {
    position = new Point(-1,-1);
  }

  /**
   * @return Nilai position.
   */
  public Point getPosition() {
    return position;
  }

  /**
   * Menetapkan nilai position berdasarkan point p.
   *
   * @param p Point yang sudah diciptakan.
   */
  public void setPosition(Point p) {
    position.setLocation(p.x,p.y);
  }

  /**
   * Menetapkan nilai position berdasarkan x dan y.
   *
   * @param x Nilai posisi absis.
   * @param y Nilai posisi ordinat.
   */
  public void setPosition(int x, int y) {
    position.setLocation(x, y);
  }

  /**
   * @return Karakter untuk dirender.
   */
  public char render() {
    return '?';
  }

  /**
   * Menggerakkan person dengan mengubah posisi.
   *
   * @param movement Nilai menentukan arah gerak animal.
   */
  public void move(int movement) {
    if (movement == 0) {    // Up
      position.move((int) position.getX(), (int) position.getY() - 1);
    } else if (movement == 1) {    // Right
      position.move((int) position.getX() + 1, (int) position.getY());
    } else if (movement == 2) {    // Down
      position.move((int) position.getX(), (int) position.getY() + 1);
    } else {    // Left
      position.move((int) position.getX() - 1, (int) position.getY());
    }
  }

  /**
   * Mengembalikan nilai posisi menjadi default.
   * Mengubah posisi person menjadi (-1,-1)
   */
  public void resetPosition() {
    position.setLocation(-1, -1);
  }
}
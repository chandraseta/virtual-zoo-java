#ifndef PERSON_H
#define PERSON_H

#include "point.h"
#include "renderable.h"

/** @class Person
  * Kelas Person memiliki person yang dapat melakukan tour dalam zoo.
  */
class Person: public Renderable {
  public:
    /** @brief Constructor
      * Menciptakan person default pada posisi (-1,-1).
      */
    Person();
    /** @brief Getter nilai position.
      * @return Nilai position.
      */
    Point GetPosition() const;
    /** @brief Menetapkan nilai position berdasarkan point p.
      * @param p Point yang sudah diciptakan.
      */
    void SetPosition(const Point& p);
    /** @brief Menetapkan nilai position berdasarkan x dan y.
      * @param x Nilai posisi absis.
      * @param y Nilai posisi ordinat.
      */
    void SetPosition(int x, int y);
    /** @brief Mengembalikan character untuk kelas render.
      * @return Karakter untuk dirender.
      */
    char Render();
    /** @brief Menggerakkan person dengan mengubah posisi.
      * @param movement Nilai menentukan arah gerak animal.
      */
    void Move(int movement);
    /** @brief Mengembalikan nilai posisi menjadi default.
      * Mengubah posisi person menjadi (-1,-1)
      */
    void ResetPosition();

  private:
    Point position;
};

#endif
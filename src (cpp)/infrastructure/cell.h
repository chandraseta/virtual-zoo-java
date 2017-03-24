#ifndef CELL_H
#define CELL_H

#include "../misc/renderable.h"

/** @class Cell
  * Kelas Cell yang mendefinisikan aksesibilitas suatu cell.
  */
class Cell: public Renderable {
  public:
    /** @brief Constructor
      * Menciptakan cell default yang dapat/tidak dapat diakses.
      * @param accessible Nilai true/false cell dapat diakses.
      */
    explicit Cell(bool accessible);
    /** @brief Copy Constructor
      * Menciptakan cell yang sama dengan cell yang sudah ada.
      * @param C Objek cell yang telah diciptakan.
      */
    Cell(Cell& C);
    /** @brief Operator=
      * Mengubah atribut cell menjadi sama dengan cell lain yang sudah ada.
      * @param C Objek cell yang telah diciptakan.
      */
    Cell& operator=(Cell& C);
    /** @brief Getter nilai is_accessible
      * @return Nilai is_accessible
      */
    bool IsAccessible() const;

  protected:
    bool is_accessible;
};

#endif
#ifndef HABITAT_H
#define HABITAT_H

#include "../cell.h"

/** @class Habitat
  * Kelas Habitat mendefinisikan atribut untuk habitat
  */
class Habitat: public Cell {
  public:
    /** @brief Constructor
      * Menciptakan habitat dengan atribut default tidak dapat diakses.
      */
    Habitat();
    
  protected:
    char type;

  private:
    const bool defAccessible;
};

#endif
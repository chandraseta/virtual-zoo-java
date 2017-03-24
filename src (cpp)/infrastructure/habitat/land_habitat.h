#ifndef LAND_HABITAT_H
#define LAND_HABITAT_H

#include "habitat.h"

/** @class LandHabitat
  * Kelas LandHabitat mendefinisikan atribut untuk habitat darat.
  */
class LandHabitat: public Habitat {
  public:
    /** @brief Constructor
      * Menciptakan habitat darat.
      */
    LandHabitat();
    /** @brief Mengembalikan character untuk kelas render.
      * @return Karakter untuk dirender.
      */
    char Render();

  private:
    const char defType;
};

#endif
#ifndef WATER_HABITAT_H
#define WATER_HABITAT_H

#include "habitat.h"

/** @class WaterHabitat
  * Kelas WaterHabitat mendefinisikan atribut untuk habitat air.
  */
class WaterHabitat: public Habitat {
  public:
    /** @brief Constructor
      * Menciptakan habitat air.
      */
    WaterHabitat();
    /** @brief Mengembalikan character untuk kelas render.
      * @return Karakter untuk dirender.
      */
    char Render();

  private:
    const char defType;
};

#endif
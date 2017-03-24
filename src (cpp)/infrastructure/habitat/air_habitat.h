#ifndef AIR_HABITAT_H
#define AIR_HABITAT_H

#include "habitat.h"

/** @class AirHabitat
  * Kelas AirHabitat mendefinisikan atribut untuk habitat udara.
  */
class AirHabitat : public Habitat {
  public:
    /** @brief Constructor
      * Menciptakan habitat udara.
      */
    AirHabitat();
    /** @brief Mengembalikan character untuk kelas render.
      * @return Karakter untuk dirender.
      */
    char Render();
    
  private:
    const char defType;
};

#endif

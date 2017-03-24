#ifndef AVES_H
#define AVES_H

#include "../animal.h"

/** @class Aves
  * Kelas Aves mendefinisikan atribut untuk aves.
  */
class Aves: public Animal {
  public:
    /** @brief Constructor
      * Menciptakan Aves dengan atribut default untuk aves pada umumnya.
      */
    Aves();

  private:
    const int def_limb_count;
    const std::string def_skin_type;
};

#endif
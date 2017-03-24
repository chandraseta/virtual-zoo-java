#ifndef MAMMALIA_H
#define MAMMALIA_H

#include "../animal.h"

/** @class Mammalia
  * Kelas Mammalia mendefinisikan atribut untuk mammalia
  */
class Mammalia: public Animal {
  public:
    /** @brief Constructor
      * Menciptakan mammalia dengan atribut default untuk mammalia pada umumnya
      */
    Mammalia();

  private:
    const int def_limb_count;
    const std::string def_skin_type;
};

#endif
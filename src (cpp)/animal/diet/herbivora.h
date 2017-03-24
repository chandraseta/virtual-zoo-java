#ifndef HERBIVORA_H
#define HERBIVORA_H

#include "animal_diet.h"

/** @class Herbivora
  * Kelas Herbivora mendifinisikan hewan pemakan tumbuhan.
  */
class Herbivora: public AnimalDiet {
  public:
    /** @brief Constructor
      * Menciptakan Herbivora (pemakan tumbuhan).
      */
    Herbivora();
    /** @brief Getter nilai kebutuhan makanan hewan dalam bentuk daging.
      * @return Jumlah daging yang dibutuhkan untuk hewan tertentu.
      */
    int GetReqMeat();
    /** @brief Getter nilai kebutuhan makanan hewan dalam bentuk tumbuhan.
      * @return Jumlah tumbuhan yang dibutuhkan untuk hewan tertentu.
      */
    int GetReqPlant();

  private:
    const bool def_eat_meat;
    const bool def_eat_plant;
};

#endif
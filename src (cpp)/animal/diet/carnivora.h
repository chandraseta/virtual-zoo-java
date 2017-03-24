#ifndef CARNIVORA_H
#define CARNIVORA_H

#include "animal_diet.h"

/** @class Carnivora
  * Kelas Carnivora mendifinisikan hewan pemakan daging.
  */
class Carnivora: public AnimalDiet {
  public:
    /** @brief Constructor
      * Menciptakan Carnivora (pemakan daging).
      */
    Carnivora();
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
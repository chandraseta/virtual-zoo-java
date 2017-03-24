#ifndef CROCODILE_H
#define CROCODILE_H

#include "reptilia.h"
#include "../diet/carnivora.h"
#include "../behavior/behavior_tame.h"

/** @class Crocodile
  * Kelas Crocodile mendefinisikan atribut untuk crocodile.
  */
class Crocodile : public Reptilia, public Carnivora, public BehaviorTame {
  public:
    /** @brief Constructor
      * Menciptakan crocodile dengan posisi (_x,_y) dan berat _weight.
      * @param _x Nilai posisi absis.
      * @param _y Nilai posisi ordinat.
      * @param _weight Nilai berat untuk crocodile.
      */
    Crocodile(int _x, int _y, int _weight);
    /** @brief Menampilkan interaksi dengan crocodile.
      * Menuliskan interaksi ke layar.
      */
    void Interact();

  private:
    const int def_ID;
    const int def_ratio_meat;
    const int def_ratio_plant;
};

#endif
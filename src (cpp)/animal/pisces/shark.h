#ifndef SHARK_H
#define SHARK_H

#include "pisces.h"
#include "../diet/carnivora.h"
#include "../behavior/behavior_tame.h"

/** @class Shark
  * Kelas Shark mendefinisikan atribut untuk shark.
  */
class Shark: public Pisces, public Carnivora, public BehaviorTame {
  public:
    /** @brief Constructor
      * Menciptakan shark dengan posisi (_x,_y) dan berat _weight.
      * @param _x Nilai posisi absis.
      * @param _y Nilai posisi ordinat.
      * @param _weight Nilai berat untuk shark.
      */
    Shark(int _x, int _y, int _weight);
    /** @brief Menampilkan interaksi dengan shark.
      * Menuliskan interaksi ke layar.
      */
    void Interact();

  private:
    const int def_ID;
    const int def_ratio_meat;
    const int def_ratio_plant;
};

#endif
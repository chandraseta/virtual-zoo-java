#ifndef BARRACUDA_H
#define BARRACUDA_H

#include "pisces.h"
#include "../diet/carnivora.h"
#include "../behavior/behavior_tame.h"

/** @class Barracuda
  * Kelas Barracuda mendefinisikan atribut untuk barracuda.
  */
class Barracuda: public Pisces, public Carnivora, public BehaviorTame {
  public:
    /** @brief Constructor
      * Menciptakan barracuda dengan posisi (_x,_y) dan berat _weight.
      * @param _x Nilai posisi absis.
      * @param _y Nilai posisi ordinat.
      * @param _weight Nilai berat untuk barracuda.
      */
    Barracuda(int _x, int _y, int _weight);
    /** @brief Menampilkan interaksi dengan barracuda.
      * Menuliskan interaksi ke layar.
      */
    void Interact();

  private:
    const int def_ID;
    const int def_ratio_meat;
    const int def_ratio_plant;
};

#endif
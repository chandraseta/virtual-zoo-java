#ifndef DUCK_H
#define DUCK_H

#include "aves.h"
#include "../diet/omnivora.h"
#include "../behavior/behavior_tame.h"

/** @class Duck
  * Kelas Duck mendefinisikan atribut untuk duck.
  */
class Duck : public Aves, public Omnivora, public BehaviorTame {
  public :
    /** @brief Constructor
      * Menciptakan duck dengan posisi (_x,_y) dan berat _weight.
      * @param _x Nilai posisi absis.
      * @param _y Nilai posisi ordinat.
      * @param _weight Nilai berat untuk duck.
      */
    Duck(int _x, int _y, int _weight);
    /** @brief Menampilkan interaksi dengan duck.
      * Menuliskan interaksi ke layar.
      */
    void Interact();

  private:
    const int def_ID;
    const int def_ratio_meat;
    const int def_ratio_plant;
};

#endif
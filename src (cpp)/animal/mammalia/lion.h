#ifndef LION_H
#define LION_H

#include "mammalia.h"
#include "../diet/carnivora.h"
#include "../behavior/behavior_tame.h"

/** @class Lion
  * Kelas Lion mendefinisikan atribut untuk lion.
  */
class Lion: public Mammalia, public Carnivora, public BehaviorTame {
  public:
    /** @brief Constructor
      * Menciptakan lion dengan posisi (_x,_y) dan berat _weight.
      * @param _x Nilai posisi absis.
      * @param _y Nilai posisi ordinat.
      * @param _weight Nilai berat untuk lion.
      */
    Lion(int _x, int _y, int _weight);
    /** @brief Menampilkan interaksi dengan lion.
      * Menuliskan interaksi ke layar.
      */
    void Interact();

  private:
    const int def_ID;
    const int def_ratio_meat;
    const int def_ratio_plant;
};

#endif
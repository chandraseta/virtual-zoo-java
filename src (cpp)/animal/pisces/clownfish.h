#ifndef CLOWNFISH_H
#define CLOWNFISH_H

#include "pisces.h"
#include "../diet/omnivora.h"
#include "../behavior/behavior_tame.h"
  
/** @class Clownfish
  * Kelas Clownfish mendefinisikan atribut untuk clownfish.
  */
class Clownfish: public Pisces, public Omnivora, public BehaviorTame {
  public:
    /** @brief Constructor
      * Menciptakan clownfish dengan posisi (_x,_y) dan berat _weight.
      * @param _x Nilai posisi absis.
      * @param _y Nilai posisi ordinat.
      * @param _weight Nilai berat untuk clownfish.
      */
    Clownfish(int _x, int _y, int _weight);
    /** @brief Menampilkan interaksi dengan clownfish.
      * Menuliskan interaksi ke layar.
      */
    void Interact();

  private:
    const int def_ID;
    const int def_ratio_meat;
    const int def_ratio_plant;
};

#endif
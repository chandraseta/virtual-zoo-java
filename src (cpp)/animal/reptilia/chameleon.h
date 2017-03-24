#ifndef CHAMELEON_H
#define CHAMELEON_H

#include "reptilia.h"
#include "../diet/omnivora.h"
#include "../behavior/behavior_tame.h"

/** @class Chameleon
  * Kelas Chameleon mendefinisikan atribut untuk chameleon.
  */
class Chameleon : public Reptilia, public Omnivora, public BehaviorTame {
  public:
    /** @brief Constructor
      * Menciptakan chameleon dengan posisi (_x,_y) dan berat _weight.
      * @param _x Nilai posisi absis.
      * @param _y Nilai posisi ordinat.
      * @param _weight Nilai berat untuk chameleon.
      */
    Chameleon(int _x, int _y, int _weight);
    /** @brief Menampilkan interaksi dengan chameleon.
      * Menuliskan interaksi ke layar.
      */
    void Interact();

  private:
    const int def_ID;
    const int def_ratio_meat;
    const int def_ratio_plant;
};

#endif
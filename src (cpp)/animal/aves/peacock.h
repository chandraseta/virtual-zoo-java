#ifndef PEACOCK_H
#define PEACOCK_H

#include "aves.h"
#include "../diet/omnivora.h"
#include "../behavior/behavior_tame.h"

/** @class Peacock
  * Kelas Peacock mendefinisikan atribut untuk peacock.
  */
class Peacock : public Aves, public Omnivora, public BehaviorTame {
  public :
    /** @brief Constructor
      * Menciptakan peacock dengan posisi (_x,_y) dan berat _weight.
      * @param _x Nilai posisi absis.
      * @param _y Nilai posisi ordinat.
      * @param _weight Nilai berat untuk peacock.
      */
    Peacock(int _x, int _y, int _weight);
    /** @brief Menampilkan interaksi dengan peacock.
      * Menuliskan interaksi ke layar.
      */
    void Interact();

  private:
    const int def_ID;
    const int def_ratio_meat;
    const int def_ratio_plant;
};

#endif
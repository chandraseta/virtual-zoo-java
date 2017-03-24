#ifndef EAGLE_H
#define EAGLE_H

#include "aves.h"
#include "../diet/carnivora.h"
#include "../behavior/behavior_tame.h"

/** @class Eagle
  * Kelas Eagle mendefinisikan atribut untuk eagle.
  */
class Eagle : public Aves, public Carnivora, public BehaviorTame {
  public :
    /** @brief Constructor
      * Menciptakan eagle dengan posisi (_x,_y) dan berat _weight.
      * @param _x Nilai posisi absis.
      * @param _y Nilai posisi ordinat.
      * @param _weight Nilai berat untuk Eagle.
      */
    Eagle(int _x, int _y, int _weight);
    /** @brief Menampilkan interaksi dengan eagle.
      * Menuliskan interaksi ke layar.
      */
    void Interact();

  private:
    const int def_ID;
    const int def_ratio_meat;
    const int def_ratio_plant;
};

#endif
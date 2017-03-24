#ifndef ZEBRA_H
#define ZEBRA_H

#include "mammalia.h"
#include "../diet/herbivora.h"
#include "../behavior/behavior_tame.h"

/** @class Zebra
  * Kelas Zebra mendefinisikan atribut untuk zebra.
  */
class Zebra: public Mammalia, public Herbivora, public BehaviorTame {
  public:
    /** @brief Constructor
      * Menciptakan zebra dengan posisi (_x,_y) dan berat _weight.
      * @param _x Nilai posisi absis.
      * @param _y Nilai posisi ordinat.
      * @param _weight Nilai berat untuk zebra.
      */
    Zebra(int _x, int _y, int _weight);
    /** @brief Menampilkan interaksi dengan zebra.
      * Menuliskan interaksi ke layar
      */
    void Interact();

  private:
    const int def_ID;
    const int def_ratio_meat;
    const int def_ratio_plant;
};

#endif
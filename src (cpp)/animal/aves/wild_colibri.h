#ifndef WILD_COLIBRI_H
#define WILD_COLIBRI_H

#include "aves.h"
#include "../diet/herbivora.h"
#include "../behavior/behavior_wild.h"

/** @class WildColibri
  * Kelas WildColibri mendefinisikan atribut untuk wild colibri.
  */
class WildColibri: public Aves, public Herbivora, public BehaviorWild {
  public:
    /** @brief Constructor
      * Menciptakan wild colibri dengan posisi (_x,_y) dan berat _weight.
      * @param _x Nilai posisi absis.
      * @param _y Nilai posisi ordinat.
      * @param _weight Nilai berat untuk wild colibri.
      */
    WildColibri(int _x, int _y, int _weight);
    /** @brief Menampilkan interaksi dengan wild colibri.
      * Menuliskan interaksi ke layar.
      */
    void Interact();

  private:
    const int def_ID;
    const int def_ratio_meat;
    const int def_ratio_plant;
};

#endif
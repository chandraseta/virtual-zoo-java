#ifndef WILD_BUNNY_H
#define WILD_BUNNY_H

#include "mammalia.h"
#include "../diet/herbivora.h"
#include "../behavior/behavior_wild.h"

/** @class WildBunny
  * Kelas WildBunny mendefinisikan atribut untuk wild bunny.
  */
class WildBunny: public Mammalia, public Herbivora, public BehaviorWild {
  public:
    /** @brief Constructor
      * Menciptakan wild bunny dengan posisi (_x,_y) dan berat _weight.
      * @param _x Nilai posisi absis.
      * @param _y Nilai posisi ordinat.
      * @param _weight Nilai berat untuk wild bunny.
      */
    WildBunny(int _x, int _y, int _weight);
    /** @brief Menampilkan interaksi dengan wild bunny.
      * Menuliskan interaksi ke layar.
      */
    void Interact();

  private:
    const int def_ID;
    const int def_ratio_meat;
    const int def_ratio_plant;
};

#endif
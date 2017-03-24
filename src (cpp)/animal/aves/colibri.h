#ifndef COLIBRI_H
#define COLIBRI_H

#include "aves.h"
#include "../diet/herbivora.h"
#include "../behavior/behavior_tame.h"

/** @class Colibri
  * Kelas Colibri mendefinisikan atribut untuk colibri.
  */
class Colibri : public Aves, public Herbivora, public BehaviorTame {
  public :
    /** @brief Constructor
      * Menciptakan colibri dengan posisi (_x,_y) dan berat _weight.
      * @param _x Nilai posisi absis.
      * @param _y Nilai posisi ordinat.
      * @param _weight Nilai berat untuk colibri.
      */
    Colibri(int _x, int _y, int _weight);
    /** @brief Menampilkan interaksi dengan colibri.
      * Menuliskan interaksi ke layar.
      */
    void Interact();

  private:
    const int def_ID;
    const int def_ratio_meat;
    const int def_ratio_plant;
};

#endif
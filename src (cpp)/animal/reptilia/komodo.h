#ifndef KOMODO_H
#define KOMODO_H

#include "reptilia.h"
#include "../diet/carnivora.h"
#include "../behavior/behavior_tame.h"

/** @class Komodo
  * Kelas Komodo mendefinisikan atribut untuk komodo.
  */
class Komodo : public Reptilia, public Carnivora, public BehaviorTame {
  public:
    /** @brief Constructor
      * Menciptakan komodo dengan posisi (_x,_y) dan berat _weight.
      * @param _x Nilai posisi absis.
      * @param _y Nilai posisi ordinat.
      * @param _weight Nilai berat untuk komodo.
      */
    Komodo(int _x, int _y, int _weight);
    /** @brief Menampilkan interaksi dengan komodo.
      * Menuliskan interaksi ke layar.
      */
    void Interact();

  private:
    const int def_ID;
    const int def_ratio_meat;
    const int def_ratio_plant;
};

#endif
#ifndef OWL_H
#define OWL_H

#include "aves.h"
#include "../diet/carnivora.h"
#include "../behavior/behavior_tame.h"

/** @class Owl
  * Kelas Owl mendefinisikan atribut untuk owl.
  */
class Owl : public Aves, public Carnivora, public BehaviorTame {
  public :
    /** @brief Constructor
      * Menciptakan owl dengan posisi (_x,_y) dan berat _weight.
      * @param _x Nilai posisi absis.
      * @param _y Nilai posisi ordinat.
      * @param _weight Nilai berat untuk owl.
      */  
    Owl(int _x, int _y, int _weight);
    /** @brief Menampilkan interaksi dengan owl.
      * Menuliskan interaksi ke layar.
      */
    void Interact();

  private:
    const int def_ID;
    const int def_ratio_meat;
    const int def_ratio_plant;
};

#endif
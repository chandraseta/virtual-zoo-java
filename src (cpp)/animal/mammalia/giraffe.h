#ifndef GIRAFFE_H
#define GIRAFFE_H

#include "mammalia.h"
#include "../diet/herbivora.h"
#include "../behavior/behavior_tame.h"

/** @class Giraffe
  * Kelas Giraffe mendefinisikan atribut untuk giraffe.
  */
class Giraffe: public Mammalia, public Herbivora, public BehaviorTame {
  public:
    /** @brief Constructor
      * Menciptakan giraffe dengan posisi (_x,_y) dan berat _weight.
      * @param _x Nilai posisi absis.
      * @param _y Nilai posisi ordinat.
      * @param _weight Nilai berat untuk giraffe.
      */
    Giraffe(int _x, int _y, int _weight);
    /** @brief Menampilkan interaksi dengan giraffe.
      * Menuliskan interaksi ke layar.
      */ 
    void Interact();

  private:
    const int def_ID;
    const int def_ratio_meat;
    const int def_ratio_plant;
};

#endif
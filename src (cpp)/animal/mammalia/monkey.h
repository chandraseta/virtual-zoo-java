#ifndef MONKEY_H
#define MONKEY_H

#include "mammalia.h"
#include "../diet/omnivora.h"
#include "../behavior/behavior_tame.h"

/** @class Monkey
  * Kelas Monkey mendefinisikan atribut untuk monkey.
  */
class Monkey: public Mammalia, public Omnivora, public BehaviorTame {
  public:
    /** @brief Constructor
      * Menciptakan monkey dengan posisi (_x,_y) dan berat _weight.
      * @param _x Nilai posisi absis.
      * @param _y Nilai posisi ordinat.
      * @param _weight Nilai berat untuk monkey.
      */
    Monkey(int _x, int _y, int _weight);
    /** @brief Menampilkan interaksi dengan monkey.
      * Menuliskan interaksi ke layar.
      */
    void Interact();

  private:
    const int def_ID;
    const int def_ratio_meat;
    const int def_ratio_plant;
};

#endif
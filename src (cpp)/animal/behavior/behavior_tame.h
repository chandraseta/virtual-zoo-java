#ifndef BEHAVIOR_TAME_H
#define BEHAVIOR_TAME_H

#include "animal_behavior.h"

/** @class BehaviorTame
  * Kelas BehaviorTame mendefinisikan perilaku hewan jinak.
  */
class BehaviorTame : public AnimalBehavior {
  public:
    /** @brief Mengubah nilai perilaku hewan.
      * Menetapkan nilai perilaku hewan menjadi jinak.
      */
    void SetBehavior();
};

#endif
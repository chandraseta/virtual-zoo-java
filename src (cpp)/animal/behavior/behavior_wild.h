#ifndef BEHAVIOR_WILD_H
#define BEHAVIOR_WILD_H

#include <set>
#include "animal_behavior.h"

/** @class BehaviorWild
  * Kelas BehaviorWild mendefinisikan perilaku hewan liar.
  */
class BehaviorWild : public AnimalBehavior {
  public:
    /** @brief Mengubah nilai perilaku hewan.
      * Menetapkan nilai perilaku hewan menjadi liar.
      */
    void SetBehavior();
    /** @brief Menambah musuh hewan.
      * Menambahkan hewan dengan ID x dari set.
      * @param x ID hewan yang ingin  ditambah.
      */
    void AddEnemy(int x);
    /** @brief Menghapus musuh hewan.
      * Melenyapkan hewan dengan ID x dari set.
      * @param x ID hewan yang ingin dihapus.
      */
    void RemoveEnemy(int x);
    /** @brief Mengecek status hewan.
      * Memeriksa apakah hewan dengan ID x merupakan musuh.
      * @param x ID hewan yang ingin diperiksa.
      * @return Nilai true/false apakah merupakan musuh.
      */
    bool IsEnemy(int x);

  private:
    std::set<int> enemy;
};

#endif
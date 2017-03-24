#ifndef ANIMAL_BEHAVIOR_H
#define ANIMAL_BEHAVIOR_H

/** @class AnimalBehavior
  * Kelas abstrak AnimalBehavior menentukan perilaku hewan.
  */
class AnimalBehavior {
  public:
    /** @brief Getter nilai is_wild. 
      * @return Nilai is_wild.
      */
    bool GetBehavior();
    /** @brief Pure virtual method
      * Menetapkan nilai perilaku hewan.
      */
    virtual void SetBehavior() = 0;

  protected:
    bool is_wild;
};

#endif
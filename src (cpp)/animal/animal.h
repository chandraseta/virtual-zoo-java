#ifndef ANIMAL_H
#define ANIMAL_H

#include "../misc/renderable.h"
#include "../misc/point.h"
#include <string>
#include <iostream>

/** @class Animal
  * Kelas Animal abstrak sebagai kelas dasar semua animal.
  */
class Animal: public Renderable {
  public:
    /** @brief Pure virtual method
      * Didefinisikan pada kelas riil hewan.
      */
    virtual void Interact() = 0;
    /** @brief Menggerakkan animal dengan mengubah posisi.
      * @param movement Nilai menentukan arah gerak animal.
      */
    void Move(int movement);
    /** @brief Getter nilai is_land_animal.
      * @return Nilai is_land_animal.
      */
    bool IsLandAnimal();
    /** @brief Getter nilai is_water_animal.
      * @return Nilai is_water_animal.
      */
    bool IsWaterAnimal();
    /** @brief Getter nilai is_air_animal.
      * @return Nilai is_air_animal.
      */
    bool IsAirAnimal();
    /** @brief Mengembalikan character untuk kelas render.
      * @return Karakter untuk dirender.
      */
    char Render();
    /** @brief Getter nilai point position.
      * @return Nilai position.
      */
    Point GetPosition();
    /** @brief Getter nilai ID.
      * @return Nilai ID.
      */
    int GetID();

  protected:
    int ID;
    int limb_count;
    std::string skin_type;
    bool is_land_animal;
    bool is_water_animal;
    bool is_air_animal;
    Point position;
};

#endif
#ifndef RESTAURANT_H
#define RESTAURANT_H

#include "facility.h"

/** @class Restaurant
  * Kelas Restaurant mendefinisikan atribut untuk restaurant.
  */
class Restaurant: public Facility {
  public:
    /** @brief Constructor
      * Menciptakan cell berisi restaurant yang dapat/tidak dapat diakses,
      * dengan nama sesuai dengan _name.
      * @param accessible Nilai true/false apakah dapat diakses.
      * @param _name Nama restaurant.
      */
    Restaurant(bool accessible, const std::string& _name);
    /** @brief Copy Constructor
      * Menciptakan restaurant dengan tingkat aksesibilitas dan nama ang sama.
      * @param R Object Restaurant yang sudah diciptakan
      */
    Restaurant(const Restaurant& R);
    /** @brief Operator=
      * Mengubah atribut suatu restaurant menjadi sama dengan restaurant lain.
      * @param R Object Restaurant yang sudah diciptakan.
      */
    Restaurant& operator=(const Restaurant& R);
    /** @brief Getter restaurant name
      * @return Nama restaurant.
      */
    std::string GetRestaurantName();
    /** @brief Mengembalikan character untuk kelas Render.
      * @return Karakter untuk dirender.
      */
    char Render() override;

  private:
    std::string name;
    const std::string def_facility_type;
};

#endif
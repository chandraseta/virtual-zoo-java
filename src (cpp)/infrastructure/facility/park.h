#ifndef PARK_H
#define PARK_H

#include "facility.h"

/** @class Park
  * Kelas Park mendefinisikan atribut untuk park.
  */
class Park: public Facility {
  public:
    /** @brief Constructor
      * Menciptakan cell berisi park yang dapat/tidak dapat diakses,
      * dengan nama sesuai dengan _name.
      * @param Accessible Nilai true/false apakah dapat diakses.
      * @param _name Nama park.
      */
    Park(bool accessible, const std::string& _name);
    /** @brief Copy Constructor
      * Menciptakan park dengan tingkat aksesibilitas dan nama yang smaa.
      * @param P Object Park yang sudah diciptakan.
      */
    Park(const Park& P);
    /** @brief Operator=
      * Mengubah atribut suatu park menjadi sama dengan park lain.
      * @param P Object Park yang sudah dciptakan.
      */
    Park& operator=(const Park& P);
    /** @brief Getter park name
      * @return Nama park.
      */
    std::string GetParkName();
    /** @brief Mengembalikan character untuk kelas render.
      * @return Karakter untuk dirender.
      */
    char Render() override;

  private:
    std::string name;
    const std::string def_facility_type;
};

#endif
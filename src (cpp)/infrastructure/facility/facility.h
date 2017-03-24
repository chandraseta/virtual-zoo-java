#ifndef FACILITY_H
#define FACILITY_H

#include <string>
#include "../cell.h"

/** @class Facility
  * Kelas Facility mendefinisikan atribut untuk facility.
  */
class Facility: public Cell {
  public:
    /** @brief Constructor
      * Menciptakan cell berisi fasilitas yang dapat/tidak dapat diakses.
      * @param Accessible Nilai true/false apakah dapat diakses.
      */
    explicit Facility(bool Accessible);

  protected:
    std::string facility_type;
};

#endif
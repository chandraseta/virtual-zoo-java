#ifndef ROAD_H
#define ROAD_H

#include "facility.h"

/** @class Road
  * Kelas Road mendefinisikan atribut untuk road.
  */
class Road: public Facility {
  public:
    /** @brief Constructor
      * Menciptakan cell berisi road yang dapat/tidak dapat diakses.
      * @param accessible Nilai true/false apakah dapat diakses.
      */
    explicit Road(bool accessible);
    /** @brief Getter nilai is_entrance
      * @return Nilai is_entrance.
      */
    bool IsEntrance();
    /** @brief Getter nilai is_exit
      * @return Nilai is_exit.
      */
    bool IsExit();
    /** @brief Mengembalikan character untuk kelas Render.
      * @return Karakter untuk dirender.
      */
    char Render() override;

  protected:
    bool is_entrance;
    bool is_exit;

  private:
    const std::string def_facility_type;
    const bool def_road;
};

#endif
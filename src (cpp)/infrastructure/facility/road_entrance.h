#ifndef ROAD_ENTRANCE_H
#define ROAD_ENTRANCE_H

#include "road.h"

/** @class RoadEntrance
  * Kelas RoadEntrance mendefinisikan atribut untuk road entrance.
  */
class RoadEntrance: public Road {
  public:
    /** @brief Constructor
      * Mendefinisikan road entrance.
      * @param accessible Nilai true/false apakah dapat diakses.
      */
    explicit RoadEntrance(bool accessible);

  private:
    const bool def_road_entrance;
};

#endif
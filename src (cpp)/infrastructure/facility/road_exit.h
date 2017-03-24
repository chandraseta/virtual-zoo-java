#ifndef ROAD_EXIT_H
#define ROAD_EXIT_H

#include "road.h"

/** @class RoadExit
  * Kelas RoadExit mendefinisikan atribut untuk road exit.
  */
class RoadExit: public Road {
  public:
    /** @brief Constructor
      * Mendefinisikan road exit.
      * @param Accesible Nilai true/false apakah dapat diakses.
      */
    explicit RoadExit(bool accessible);

  private:
    const bool def_road_exit;
};

#endif
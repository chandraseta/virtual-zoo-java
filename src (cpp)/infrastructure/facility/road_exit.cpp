#include "road_exit.h"

RoadExit::RoadExit(bool accessible): Road(accessible), def_road_exit(true) {
  is_exit = def_road_exit;
}
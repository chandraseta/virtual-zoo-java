#include "road_entrance.h"

RoadEntrance::RoadEntrance(bool accessible): Road(accessible), def_road_entrance(true) {
  is_entrance = def_road_entrance;
}
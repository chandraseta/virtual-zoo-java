#include "road.h"

Road::Road(bool accessible): Facility(accessible), def_facility_type("Road"), def_road(false) {
  is_entrance = def_road;
  is_exit = def_road;
}
bool Road::IsEntrance() {
  return(is_entrance);
}
bool Road::IsExit() {
  return(is_exit);
}
char Road::Render() {
  return '.';
}
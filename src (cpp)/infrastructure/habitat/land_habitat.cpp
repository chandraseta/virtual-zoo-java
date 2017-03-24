#include "land_habitat.h"

LandHabitat::LandHabitat(): defType('L') {
  type = defType;
}
char LandHabitat::Render() {
  return 'l';
}
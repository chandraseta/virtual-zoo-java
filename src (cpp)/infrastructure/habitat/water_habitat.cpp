#include "water_habitat.h"

WaterHabitat::WaterHabitat(): defType('W') {
  type = defType;
}
char WaterHabitat::Render() {
  return 'w';
}
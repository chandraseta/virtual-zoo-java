#include "air_habitat.h"

AirHabitat::AirHabitat(): defType('A') {
  type = defType;
}
char AirHabitat::Render() {
  return 'a';
}
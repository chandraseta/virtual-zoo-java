#include "carnivora.h"

Carnivora::Carnivora(): def_eat_meat(true), def_eat_plant(false) {
  eat_meat = def_eat_meat;
  eat_plant = def_eat_plant;
}
int Carnivora::GetReqMeat() {
  return (ratio_meat * weight / 100);
}
int Carnivora::GetReqPlant() {
  return 0;
}
#include "omnivora.h"

Omnivora::Omnivora(): def_eat_meat(true), def_eat_plant(true) {
  eat_meat = def_eat_meat;
  eat_plant = def_eat_plant;
}
int Omnivora::GetReqMeat() {
  return (ratio_meat * weight / 100);
}
int Omnivora::GetReqPlant() {
  return (ratio_plant * weight / 100);
}
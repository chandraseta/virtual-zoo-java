#include "herbivora.h"

Herbivora::Herbivora(): def_eat_meat(false), def_eat_plant(true) {
  eat_meat = def_eat_meat;
  eat_plant = def_eat_plant;
}
int Herbivora::GetReqMeat() {
  return 0;
}
int Herbivora::GetReqPlant() {  
  return (ratio_plant * weight / 100);
}
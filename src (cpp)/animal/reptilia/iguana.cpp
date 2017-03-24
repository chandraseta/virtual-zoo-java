#include "iguana.h"

Iguana::Iguana(int _x, int _y, int _weight) : def_ID(10),
                                              def_ratio_meat(20),
                                              def_ratio_plant(40) {
  ID = def_ID;
  position.SetX(_x);
  position.SetY(_y);
  ratio_meat = def_ratio_meat;
  ratio_plant = def_ratio_plant;
  is_land_animal = true;
  is_water_animal = false;
  is_air_animal = false;
  weight = _weight;
}
void Iguana::Interact() {
  std::cout << "The iguana is calmly sleeping on a tree." << std::endl;
}
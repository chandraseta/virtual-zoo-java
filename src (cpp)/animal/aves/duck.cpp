#include "duck.h"

Duck::Duck(int _x, int _y, int _weight) : def_ID(16),
                                          def_ratio_meat(30),
                                          def_ratio_plant(30) {
  ID = def_ID;
  position.SetX(_x);
  position.SetY(_y);
  ratio_meat = def_ratio_meat;
  ratio_plant = def_ratio_plant;
  is_land_animal = true;
  is_water_animal = true;
  is_air_animal = true;
  weight = _weight;
}
void Duck::Interact() {
  std::cout << "The duck just quacked loudly" << std::endl;
}
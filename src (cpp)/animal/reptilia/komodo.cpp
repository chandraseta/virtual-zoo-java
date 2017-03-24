#include "komodo.h"

Komodo::Komodo(int _x, int _y, int _weight) : def_ID(10),
                                              def_ratio_meat(70),
                                              def_ratio_plant(0) {
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
void Komodo::Interact() {
  std::cout << "The komodo is looking at you intensely" << std::endl;
}
#include "crocodile.h"

Crocodile::Crocodile(int _x, int _y, int _weight) : def_ID(8),
                                                    def_ratio_meat(60),
                                                    def_ratio_plant(0) {
  ID = def_ID;
  position.SetX(_x);
  position.SetY(_y);
  ratio_meat = def_ratio_meat;
  ratio_plant = def_ratio_plant;
  is_land_animal = true;
  is_water_animal = true;
  is_air_animal = false;
  weight = _weight;
}
void Crocodile::Interact() {
  std::cout << "The crocodile is laying still on a slab of rock" << std::endl;
}
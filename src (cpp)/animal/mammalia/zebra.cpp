#include "zebra.h"

Zebra::Zebra(int _x, int _y, int _weight) : def_ID(4),
                                            def_ratio_meat(0),
                                            def_ratio_plant(45) {
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
void Zebra::Interact() {
  std::cout << "The zebra is running at the grass field" << std::endl;
}
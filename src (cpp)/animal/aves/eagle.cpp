#include "eagle.h"

Eagle::Eagle(int _x, int _y, int _weight) : def_ID(18),
                                            def_ratio_meat(60),
                                            def_ratio_plant(0) {
  ID = def_ID;
  position.SetX(_x);
  position.SetY(_y);
  ratio_meat = def_ratio_meat;
  ratio_meat = def_ratio_plant;
  is_land_animal = true;
  is_water_animal = false;
  is_air_animal = true;
  weight = _weight;
}
void Eagle::Interact() {
  std::cout << "The eagle is roosting majestically on a tree" << std::endl;
}
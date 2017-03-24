#include "colibri.h"

Colibri::Colibri(int _x, int _y, int _weight) : def_ID(19),
                                                def_ratio_meat(0),
                                                def_ratio_plant(60) {
  ID = def_ID;
  position.SetX(_x);
  position.SetY(_y);
  ratio_meat = def_ratio_meat;
  ratio_plant = def_ratio_plant;
  is_land_animal = true;
  is_water_animal = false;
  is_air_animal = true;
  weight = _weight;
}
void Colibri::Interact() {
  std::cout << "The colibri is looking at you, apparently confused" << std::endl;
}
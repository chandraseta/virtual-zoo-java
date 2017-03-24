#include "wild_colibri.h"

WildColibri::WildColibri(int _x, int _y, int _weight) : def_ID(21),
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
  AddEnemy(2); // lion
  AddEnemy(3); // tiger
  AddEnemy(9); // python
  AddEnemy(19); // colibri
}
void WildColibri::Interact() {
  std::cout << "The wild colibri is going to skewer your eyes" << std::endl;
}
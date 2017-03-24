#include "wild_bunny.h"

WildBunny::WildBunny(int _x, int _y, int _weight) : def_ID(0),
                                                    def_ratio_meat(0),
                                                    def_ratio_plant(90) {
  ID = def_ID;
  position.SetX(_x);
  position.SetY(_y);
  ratio_meat = def_ratio_meat;
  ratio_plant = def_ratio_plant;
  is_land_animal = true;
  is_water_animal = false;
  is_air_animal = false;
  weight = _weight;
  for (int id = def_ID; id <= 21; id++) {
    AddEnemy(id);
  }
}
void WildBunny::Interact() {
  std::cout << "The wild bunny is looking at you with murderous intent" << std::endl;
}
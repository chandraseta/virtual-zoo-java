#include "shark.h"

Shark::Shark(int _x, int _y, int _weight) : def_ID(13),
                                            def_ratio_meat(70),
                                            def_ratio_plant(0) {
  ID = def_ID;
  position.SetX(_x);
  position.SetY(_y);
  ratio_meat = def_ratio_meat;
  ratio_plant = def_ratio_plant;
  is_land_animal = false;
  is_water_animal = true;
  is_air_animal = false;
  weight = _weight;
}
void Shark::Interact() {
  std::cout << "The shark is staring at you menacingly" << std::endl;
}
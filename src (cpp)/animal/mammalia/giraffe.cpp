#include "giraffe.h"

Giraffe::Giraffe(int _x, int _y, int _weight) : def_ID(3),
                                                def_ratio_meat(0),
                                                def_ratio_plant(60) {
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
void Giraffe::Interact() {
  std::cout << "The giraffe is looking down to you, literally" << std::endl;
}
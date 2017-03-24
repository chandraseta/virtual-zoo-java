#include "clownfish.h"

Clownfish::Clownfish(int _x, int _y, int _weight) : def_ID(14),
                                                    def_ratio_meat(30),
                                                    def_ratio_plant(40) {
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
void Clownfish::Interact() {
  std::cout << "The clownfish is not as funny as its name..." << std::endl;
}
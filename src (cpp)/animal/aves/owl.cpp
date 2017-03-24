#include "owl.h"

Owl::Owl(int _x, int _y, int _weight) : def_ID(17),
                                      def_ratio_meat(60),
                                      def_ratio_plant(0) {
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
void Owl::Interact() {
  std::cout << "The owl is hooting randomly" << std::endl;
}
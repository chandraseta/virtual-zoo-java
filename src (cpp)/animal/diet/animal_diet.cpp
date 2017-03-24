#include "animal_diet.h"
#include <iostream>

bool AnimalDiet::IsHerbivore() {
  return (!eat_meat && eat_plant);
}
bool AnimalDiet::IsCarnivore() {
  return (eat_meat && !eat_plant);
}
bool AnimalDiet::IsOmnivore() {
  return (eat_meat && eat_plant);
}
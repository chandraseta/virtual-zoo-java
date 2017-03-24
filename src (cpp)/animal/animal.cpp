#include "animal.h"

void Animal::Move(int movement) {
  if (movement == 1) { // Move up
    position.SetY(position.GetY()-1);
  }
  else if (movement == 2) { // Move right
    position.SetX(position.GetX()+1);
  }
  else if (movement == 3) { // Move down
    position.SetY(position.GetY()+1);
  }
  else { // Move left
    position.SetX(position.GetX()-1);
  }
}
bool Animal::IsLandAnimal() {
  return(is_land_animal);
}
bool Animal::IsWaterAnimal() {
  return(is_water_animal);
}
bool Animal::IsAirAnimal() {
  return(is_air_animal);
}
char Animal::Render() {
  return 'O';
}
Point Animal::GetPosition() {
  return position;
}
int Animal::GetID() {
  return ID;
}
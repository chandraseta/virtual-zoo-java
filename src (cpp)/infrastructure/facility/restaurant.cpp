#include "restaurant.h"

Restaurant::Restaurant(bool accessible, const std::string& _name): Facility(accessible), def_facility_type("Restaurant"), name(_name) {
  facility_type = def_facility_type;
}
Restaurant::Restaurant(const Restaurant& R): Facility(R.is_accessible), def_facility_type("Restaurant"), name(R.name) {
  facility_type = R.facility_type;
}
Restaurant& Restaurant::operator=(const Restaurant& R) {
  name = R.name;
  facility_type = R.facility_type;
  is_accessible = R.is_accessible;
  return *this;
}
std::string Restaurant::GetRestaurantName() {
  return name;
}

char Restaurant::Render() {
  return 'R';
}
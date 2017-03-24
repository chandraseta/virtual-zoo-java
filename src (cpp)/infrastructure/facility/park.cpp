#include "park.h"

Park::Park(bool accessible, const std::string& _name): Facility(accessible), def_facility_type("Park"), name(_name) {
  facility_type = def_facility_type;
}
Park::Park(const Park& P): Facility(P.is_accessible), def_facility_type("Park"), name(P.name) {
  facility_type = P.facility_type;
  is_accessible = P.is_accessible;
}
Park& Park::operator=(const Park& P) {
  name = P.name;
  facility_type = P.facility_type;
  is_accessible = P.is_accessible;
  return *this;
}
std::string Park::GetParkName() {
  return name;
}
char Park::Render() {
  return '*';
}
#include "cell.h"

Cell::Cell(bool accessible) {
  is_accessible = accessible;
}
Cell::Cell(Cell& C) {
  is_accessible = C.is_accessible;
}
Cell& Cell::operator=(Cell& C) {
  is_accessible = C.is_accessible;
  return *this;
}
bool Cell::IsAccessible() const {
  return is_accessible;
}
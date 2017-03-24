#include "point.h"

Point::Point() {
  x = 0;
  y = 0;
}
Point::Point(int _x, int _y) {
  x = _x;
  y = _y;
}
void Point::SetX(int _x) {
  x = _x;
}
void Point::SetY(int _y) {
  y = _y;
}
int Point::GetX() const {
  return x;
}
int Point::GetY() const {
  return y;
}
bool Point::operator<(const Point& p) const {
  if (x < p.x)
    return true;
  else if (x == p.x && y < p.y)
    return true;
  else
    return false;
}
Point Point::Up() {
  return Point(x,y+1);
}
Point Point::Down() {
  return Point(x,y-1);
}
Point Point::Left() {
  return Point(x-1,y);
}
Point Point::Right() {
  return Point(x+1,y);
}
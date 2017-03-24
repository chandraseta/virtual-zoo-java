#include <cctype>
#include <cstdlib>
#include <ctime>
#include <iostream>
#include "zoo.h"

Zoo::Zoo() {
  map = new Cell**[WIDTH];
  map_char = new char*[WIDTH];
  for (int i = 0; i < WIDTH; ++i) {
    map[i] = new Cell*[LENGTH];
    map_char[i] = new char[LENGTH];
    for (int j = 0; j < LENGTH; ++j) {
      map[i][j] = NULL;
      map_char[i][j] = ' ';
    }
  }
}
Zoo::~Zoo() {
  for (int i = 0; i < WIDTH; ++i) {
    delete [] map[i];
    delete [] map_char[i];
  }
  delete [] map;
  delete [] map_char;
}
void Zoo::SetTile(Cell* c, int i, int j) {
  map[i][j] = c;
}
Cell& Zoo::GetTile(int i, int j) {
  return *map[i][j];
}
void Zoo::InsertCage(const Cage& c) {
  cages.push_back(c);
}
Cage Zoo::RemoveCage(int i) {
  if (i < cages.size()) {
    Cage c = cages[i];
    cages.erase(cages.begin() + i);
    return c;
  }
}
void Zoo::Render(Person& visitor) {
  for (int i = 0; i < WIDTH; ++i) {
    for (int j = 0; j < LENGTH; ++j) {
      map_char[i][j] = map[i][j]->Render();
    }
  }
  for (int i = 0; i < cages.size(); ++i) {
    for (auto &it: cages[i].GetArea()) {
      map_char[it.GetY()][it.GetX()] = toupper(map_char[it.GetY()][it.GetX()]);
    }
  }
  for (int i = 0; i < cages.size(); ++i) {
    for (auto &it: cages[i].GetAnimal()) {
      Point loc = it->GetPosition();
      map_char[loc.GetY()][loc.GetX()] = it->Render();
    }
  }
  Point loc = visitor.GetPosition();
  if (loc.GetX() >= 0 && loc.GetX() < LENGTH && loc.GetY() >= 0 && loc.GetY() < WIDTH)
    map_char[loc.GetY()][loc.GetX()] = visitor.Render();
}
void Zoo::Print(int ux, int uy, int lx, int ly) {
  for (int i = uy; i <= ly; ++i) {
    for (int j = ux; j <= lx; ++j) {
      cout << map_char[i][j];
    }
    cout << '\n';
  }
}
void Zoo::ListAllEntranceExit() {
  for (int i = 0; i < WIDTH; ++i) {
    for (int j = 0; j < LENGTH; ++j) {
      if (Road* r = dynamic_cast<Road*>(map[i][j])) {
        if (r->IsEntrance()) {
          entrance.insert(Point(j,i));
        } else if (r->IsExit()) {
          exit.insert(Point(j,i));
        }
      }
    }
  }
}
Cell*** Zoo::GetMap() {
  return map;
}
set<Point>& Zoo::GetEntrance() {
  return entrance;
}
set<Point>& Zoo::GetExit() {
  return exit;
}
vector<Cage>& Zoo::GetCages() {
  return cages;
}
#include "behavior_wild.h"

void BehaviorWild::SetBehavior() {
  is_wild = true;
}
void BehaviorWild::AddEnemy(int x) {
  enemy.insert(x);
}
void BehaviorWild::RemoveEnemy(int x) {
  enemy.erase(x);
}
bool BehaviorWild::IsEnemy(int x) {
  return(enemy.find(x) != enemy.end());
}
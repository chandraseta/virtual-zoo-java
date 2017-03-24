#ifndef CAGE_H
#define CAGE_H

#include <set>
#include <vector>
#include "../misc/point.h"
#include "../animal/animal.h"

#define LAND  0
#define WATER 1
#define AIR   2

using namespace std;

/** @class Cage
    * Kelas Cage yang memiliki area dan berisi animal
    */
class Cage {
  public:
    /** @brief Constructor
      * Menciptakan cage default yaitu dengan habitat darat.
      */
    explicit Cage(int _type = LAND);
    /** @brief Menambahkan point P menjadi area dalam cage.
      * @param p Nilai point yang akan ditambahkan.
      */
    void AddPoint(const Point& p);
    /** @brief Menghilangkan point P dari area dalam cage.
      * @param p Nilai point yang akan dihilangkan.
      */
    void RemovePoint(const Point& p);
    /** @brief Menambahkan animal ke dalam cage.
      * Akan dicek terlebih dahulu apakah cage sudah penuh.
      * @param A Hewan yang ingin ditambahkan.
      */
    void AddAnimal(Animal& A);
    /** @brief Menghilangkan animal ke-i dari cage.
      * @param i Indeks animal yang ingin dikurangi.
      * @return Hewan yang telah dihilangkan.
      */
    Animal* RemoveAnimal(int i);
    /** @brief Menggerakkan semua animal di dalam cage.
      * Akan dicek agar animal tidak keluar dari cage.
      */
    void MoveAnimal();
    /** @brief Getter area cage.
      * @return Set of point yang menyatakan area cage.
      */
    set<Point> GetArea();
    /** @brief Getter daftar animal.
      * @return Vector of pointer to Animal yang berisi hewan.
      */
    vector<Animal*> GetAnimal();

  private:
    int type;
    set<Point> area;
    vector<Animal*> animal;
    int nb_animal;
};

#endif
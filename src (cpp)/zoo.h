#ifndef ZOO_H
#define ZOO_H

#include <set>
#include <vector>
#include "animal/aves/colibri.h"
#include "animal/aves/duck.h"
#include "animal/aves/eagle.h"
#include "animal/aves/owl.h"
#include "animal/aves/peacock.h"
#include "animal/aves/wild_colibri.h"
#include "animal/diet/animal_diet.h"
#include "animal/mammalia/elephant.h"
#include "animal/mammalia/giraffe.h"
#include "animal/mammalia/lion.h"
#include "animal/mammalia/monkey.h"
#include "animal/mammalia/tiger.h"
#include "animal/mammalia/wild_bunny.h"
#include "animal/mammalia/wolf.h"
#include "animal/mammalia/zebra.h"
#include "animal/pisces/barracuda.h"
#include "animal/pisces/clownfish.h"
#include "animal/pisces/shark.h"
#include "animal/reptilia/chameleon.h"
#include "animal/reptilia/crocodile.h"
#include "animal/reptilia/iguana.h"
#include "animal/reptilia/komodo.h"
#include "animal/reptilia/python.h"
#include "infrastructure/cage.h"
#include "infrastructure/cell.h"
#include "infrastructure/facility/park.h"
#include "infrastructure/facility/restaurant.h"
#include "infrastructure/facility/road.h"
#include "infrastructure/facility/road_entrance.h"
#include "infrastructure/facility/road_exit.h"
#include "infrastructure/habitat/air_habitat.h"
#include "infrastructure/habitat/habitat.h"
#include "infrastructure/habitat/land_habitat.h"
#include "infrastructure/habitat/water_habitat.h"
#include "misc/person.h"
#include "misc/point.h"

const int WIDTH = 20;
const int LENGTH = 20;

/** @class Zoo
  * Kelas Zoo berisi elemen-elemen dari virtual zoo.
  */
class Zoo {
  public:
    /** @brief Constructor
      * Mengalokasikan Zoo kosong dengan ukuran WIDTH x LENGTH.
      */
    Zoo();
    /** @brief Destructor
      * Mendealokasi Zoo.
      */
    ~Zoo();
    /** @brief Menetapkan jenis cell pada titik (i,j).
      * @param c Suatu cell yang telah diciptakan.
      * @param i Indeks matriks (absis).
      * @param j Indeks matriks (ordinat).
      */
    void SetTile(Cell* c, int i, int j);
    /** @brief Getter cell pada titik (i,j).
      * @param i Indeks matriks (absis).
      * @param j Indeks matriks (ordinat).
      * @return Cell pada titik (i,j).
      */
    Cell& GetTile(int i, int j);
    /** @brief Menambahkan cage baru dalam zoo.
      * @param c Cage yang sudah diciptakan.
      */
    void InsertCage(const Cage& c);
    /** @brief Menghilangkan cage pada indeks ke-i dari zoo.
      * @param i Indeks cage yang ingin dihilangkan.
      * @return Cage yang dihapus
      */
    Cage RemoveCage(int i);
    /** @brief Melakukan proses render untuk seisi zoo.
      * @param visitor Person yang merupakan pengunjung zoo.
      */
    void Render(Person& visitor);
    /** @brief Menampilkan hasil render zoo ke layar.
      * @param ux Nilai absis koordinat pojok kiri atas.
      * @param uy Nilai ordinat koordinat pojok kiri atas.
      * @param lx Nilai absis koordinat pojok kanan bawah.
      * @param ly NIlai ordinat koordinat pojok kanan bawah.
      */
    void Print(int ux = 0, int uy = 0, int lx = LENGTH - 1, int ly = WIDTH - 1);
    /** @brief Melist semua entrance dan exit dari zoo. 
      * Mencari semua entrance dan exit dari zoo dan menyimpannya.
      */
    void ListAllEntranceExit();
    /** @brief Getter map.
      * @return Nilai map.
      */
    Cell*** GetMap();
    /** @brief Getter list entrance zoo.
      * @return Set berisi point lokasi entrance zoo.
      */
    set<Point>& GetEntrance();
    /** @brief Getter list exit zoo.
      * @return Set berisi point lokasi exit zoo.
      */
    set<Point>& GetExit();
    /** @brief Getter list cage dalam zoo.
      * @return Vector berisi point lokasi cage zoo.
      */
    vector<Cage>& GetCages();

  private:
    Cell*** map;
    char** map_char;
    vector<Cage> cages;
    set<Point> entrance;
    set<Point> exit;
};

#endif
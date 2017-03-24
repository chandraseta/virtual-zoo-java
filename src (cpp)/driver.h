#ifndef DRIVER_H
#define DRIVER_H

#include "zoo.h"

/** @class Driver
  * Kelas Driver yang menjalankan semua fungsi Virtual Zoo.
  */
class Driver {
  public:
    /** @brief Constructor
      * Menciptakan driver yang berisi menu utama. 
      */
    Driver();
    /** @brief Menampilkan area tertentu dalam zoo.
      * Menampilkan area dalam zoo sesuai permintaan user.
      */
    void DisplayZoo();
    /** @brief Melakukan tour dalam zoo.
      * Melakukan tour sebagai Person di dalam virtual zoo.
      */
    void TourZoo();
    /** @brief Menghitung jumlah makanan yang dibutuhkan.
      * Menghitung dan menampilkan jumlah makanan yang dikonsumsi
      * oleh semua hewan di dalam zoo per harinya.
      */
    void ConsumedFood();

  private:
    Zoo zoo;
    Person visitor;
    /** @brief Menginisialisasi zoo.
      * Mengisi zoo berdasarkan file eksternal layout.in.
      */
    void InitZoo();
    /** @brief Melakukan tour dalam zoo.
      * Memilih entrance secara random dan memulai tour dari titik tersebut.
      */
    void Tour();
};

#endif
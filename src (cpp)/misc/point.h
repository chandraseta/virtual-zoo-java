#ifndef POINT_H
#define POINT_H

/** @class Point
  * Kelas Point berisi absis dan ordinat
  */
class Point {
  public:
    /** @brief Constructor
      * Mendefinisikan sebuah point pada titik origin (0,0).
      */
    Point();
    /** @brief Constructor
      * Mendefinisikan sebuah point dengan absis _x dan ordinat _y.
      * @param _x Nilai absis.
      * @param _y Nilai ordinat.
      */
    Point(int _x, int _y);
    /** @brief Menetapkan nilai absis
      * Mengganti nilai absis menjadi _x.
      * @param _x Nilai absis.
      */
    void SetX(int _x);
    /** @brief Menetapkan nilai ordinat
      * Mengganti nilai ordinat menjadi _y.
      * @param _y Nilai ordinat.
      */
    void SetY(int _y);
    /** @brief Getter nilai absis
      * @return Nilai absis.
      */
    int GetX() const;
    /** @brief Getter nilai ordinat
      * @return Nilai ordinat.
      */
    int GetY() const;
    /** @brief Operator<
      * Membandingkan Point dengan suatu Point lain P.
      * Perbandingan awal berdasarkan absis baru kemudian ordinat.
      * @param P Object Point yang sudah diciptakan.
      */
    bool operator<(const Point& p) const;
    /** @brief Menggeser point satu petak ke atas
      * @return Point yang telah digeser satu petak ke atas
      */
    Point Up();
    /** @brief Menggeser point satu petak ke bawah
      * @return Point yang telah digeser satu petak ke bawah
      */
    Point Down();
    /** @brief Menggeser point satu petak ke kiri
      * @return Point yang telah digeser satu petak ke kiri
      */
    Point Left();
    /** @brief Menggeser point satu petak ke kanan
      * @return Point yang telah digeser satu petak ke kanan
      */
    Point Right();

  private:
    unsigned int x;
    unsigned int y;
};

#endif
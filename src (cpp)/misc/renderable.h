#ifndef RENDERABLE_H
#define RENDERABLE_H

/** @class Renderable
  * Kelas Renderable yang merupakan Abstract Base Class untuk proses render.
  */
class Renderable {
  public:
    /** @brief Pure virtual method.
      * Didefiniskan pada kelas turunan.
      */
    virtual char Render() = 0;
};

#endif
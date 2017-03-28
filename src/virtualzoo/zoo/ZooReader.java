package virtualzoo.zoo;

import virtualzoo.animal.*;
import virtualzoo.animal.aves.*;
import virtualzoo.animal.mammalia.*;
import virtualzoo.animal.pisces.*;
import virtualzoo.animal.reptilia.*;
import virtualzoo.infrastructure.facility.*;
import virtualzoo.infrastructure.habitat.*;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Kelas Zoo merupakan kelas boundary untuk membaca
 * virtual zoo dari file eksternal.
 *
 * @author Felix Limanta - 13515065
 * @version 3.0
 * @since   3.0
 */
public class ZooReader {

  /**
   * Atribut untuk menyimpan zoo yang dibaca dari file
   */
  private Zoo zoo;

  /**
   * Konstruktor
   * Membaca zoo berdasarkan nama file yang diberikan
   * @param filename Nama file yang akan dibuka
   * @throws IOException Jika gagal buka atau gagal baca
   */
  public ZooReader(String filename) throws IOException {
    FileInputStream fstream;
    DataInputStream in;
    BufferedReader br;

    fstream = new FileInputStream(String.format("%s", filename));
    in = new DataInputStream(fstream);
    br = new BufferedReader(new InputStreamReader(in));


    readMap(br);
    readCages(br);

    br.close();
    in.close();
    fstream.close();
  }

  /**
   * Getter zoo
   * @return Zoo yang telah dibaca
   */
  public Zoo getZoo() {
    return zoo;
  }

  /**
   * Membaca map dari file
   * @param br Buffer pembacaan
   * @throws IOException Jika gagal membaca
   */
  private void readMap(BufferedReader br) throws IOException {
    String[] strSplit = br.readLine().split("\\s+");
    int length = Integer.parseInt(strSplit[0]);
    int width = Integer.parseInt(strSplit[1]);
    zoo = new Zoo(length,width);

    for (int i = 0; i < Zoo.DEF_WIDTH; ++i) {
      String strLine = br.readLine();
      for (int j = 0; j < Zoo.DEF_LENGTH; ++j) {
        switch (strLine.charAt(j)) {
          case 'w':
            zoo.setTile(new WaterHabitat(),i,j); break;
          case 'l':
            zoo.setTile(new LandHabitat(),i,j); break;
          case 'a':
            zoo.setTile(new AirHabitat(),i,j); break;
          case '.':
            zoo.setTile(new Road(true),i,j); break;
          case '>':
            zoo.setTile(new RoadEntrance(true),i,j); break;
          case '<':
            zoo.setTile(new RoadExit(true),i,j); break;
          case '*':
            zoo.setTile(new Park(false,""),i,j); break;
          case 'R':
            zoo.setTile(new Restaurant(false,""),i,j); break;
        }
      }
    }
  }

  /**
   * Membaca cage yang berisi area dan animal dari file
   * @param br Buffer pembacaan
   * @throws IOException jika gagal membaca file
   */
  private void readCages(BufferedReader br) throws IOException {
    String strLine = br.readLine();

    while (!strLine.equals("######")) {
      Cage c = new Cage(Cage.LAND);

      strLine = br.readLine();
      while (strLine.charAt(0) != '-') {
        String [] strSplit = strLine.split("\\s+");
        int y = Integer.parseInt(strSplit[0]);
        int x = Integer.parseInt(strSplit[1]);
        c.addPoint(new Point(x,y));

        strLine = br.readLine();
      }

      strLine = br.readLine();
      Queue<Animal> wildAnimals = new LinkedList<Animal>();
      while (strLine.charAt(0) != '#') {
        String [] strSplit = strLine.split("\\s+");
        String species = strSplit[0];
        int y = Integer.parseInt(strSplit[1]);
        int x = Integer.parseInt(strSplit[2]);
        int w = Integer.parseInt(strSplit[3]);

        if (species.equals("Wolf")) {
          c.addAnimal(new Wolf(x,y,w));
        } else if (species.equals("Lion")) {
          c.addAnimal(new Lion(x,y,w));
        } else if (species.equals("Tiger")) {
          c.addAnimal(new Tiger(x,y,w));
        } else if (species.equals("Zebra")) {
          c.addAnimal(new Zebra(x,y,w));
        } else if (species.equals("Monkey")) {
          c.addAnimal(new Monkey(x,y,w));
        } else if (species.equals("Giraffe")) {
          c.addAnimal(new Giraffe(x,y,w));
        } else if (species.equals("Elephant")) {
          c.addAnimal(new Elephant(x,y,w));
        } else if (species.equals("Crocodile")) {
          c.addAnimal(new Crocodile(x,y,w));
        } else if (species.equals("Python")) {
          c.addAnimal(new Python(x,y,w));
        } else if (species.equals("Komodo")) {
          c.addAnimal(new Komodo(x,y,w));
        } else if (species.equals("Iguana")) {
          c.addAnimal(new Iguana(x,y,w));
        } else if (species.equals("Chameleon")) {
          c.addAnimal(new Chameleon(x,y,w));
        } else if (species.equals("Shark")) {
          c.addAnimal(new Shark(x,y,w));
        } else if (species.equals("Clownfish")) {
          c.addAnimal(new Clownfish(x,y,w));
        } else if (species.equals("Barracuda")) {
          c.addAnimal(new Barracuda(x,y,w));
        } else if (species.equals("Owl")) {
          c.addAnimal(new Owl(x,y,w));
        } else if (species.equals("Eagle")) {
          c.addAnimal(new Eagle(x,y,w));
        } else if (species.equals("Colibri")) {
          c.addAnimal(new Colibri(x,y,w));
        } else if (species.equals("Peacock")) {
          c.addAnimal(new Peacock(x,y,w));
        } else if (species.equals("Duck")) {
          c.addAnimal(new Duck(x,y,w));
        } else if (species.equals("WildColibri")) {
          wildAnimals.add(new WildColibri(x,y,w));
        } else {
          wildAnimals.add(new WildBunny(x,y,w));
        }
        strLine = br.readLine();
      }

      while (!wildAnimals.isEmpty())
        c.addAnimal(wildAnimals.remove());

      zoo.addCage(c);
    }
  }
}


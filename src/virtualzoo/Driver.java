package virtualzoo;

import java.io.IOException;
import java.util.Scanner;
import virtualzoo.zoo.Zoo;
import virtualzoo.zoo.ZooDisplay;
import virtualzoo.zoo.ZooFood;
import virtualzoo.zoo.ZooReader;
import virtualzoo.zoo.ZooTour;

/**
 * Kelas driver Virtual Zoo
 *
 * @author Felix Limanta - 13515065
 * @version 3.0
 * @since 3.0
 */
public class Driver {

  /**
   * Zoo yang ada saat ini.
   */
  private Zoo zoo;

  /**
   * Constructor.
   * Antarmuka untuk masuk ke fitur-fitur yang ada di Virtual Zoo.
   *
   * @throws IOException Dilempar jika gagal terdapat kesalahan dalam membaca.
   */
  public Driver() throws IOException {
    zoo = new ZooReader("layout.in").getZoo();

    Scanner in = new Scanner(System.in);

    int n;
    do {
      System.out.print("\033[H\033[2J");
      System.out.flush();

      do {
        System.out.println("VIRTUAL ZOO\n");
        System.out.println("1. Print zoo");
        System.out.println("2. Tour zoo");
        System.out.println("3. Calculate consumed food");
        System.out.println("0. Exit\n");
        System.out.print("Selection: ");

        n = in.nextInt();
      } while (n < 0 && n > 3);

      switch (n) {
        case 1:
          new ZooDisplay(zoo).displayZoo();
          break;
        case 2:
          new ZooTour(zoo);
          break;
        case 3:
          new ZooFood(zoo).displayTotalFood();
          break;
        default:
          break;
      }
    } while (n != 0);
  }
}

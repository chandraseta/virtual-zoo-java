package virtualzoo.zoo;

import java.util.Scanner;
import virtualzoo.animal.Animal;
import virtualzoo.animal.diet.AnimalDiet;

/**
 * Kelas ZooFood merupakan kelas untuk memfasilitasi
 * perhitungan makanan yang dkonsumsi di Zoo.
 *
 * @author Felix Limanta - 13515065
 * @version 3.0
 * @since   3.0
 */
public class ZooFood {

  /**
   * Zoo yang dihitung konsumsi makanannya.
   */
  private Zoo zoo;

  /**
   * Total daging yang dikonsumsi di Zoo.
   */
  private int totalMeat;

  /**
   * Total tumbuhan yang dikonsumsi di Zoo.
   */
  private int totalPlant;

  /**
   * Konstruktor.
   * @param zoo Zoo yang akan dihitung konsumsi makanannya.
   */
  public ZooFood(Zoo zoo) {
    this.zoo = zoo;
    totalMeat = 0;
    totalPlant = 0;
  }

  /**
   * Getter
   * @return Total daging yang dikonsumsi di Zoo.
   */
  public int getTotalMeat() {
    return totalMeat;
  }

  /**
   * Getter
   * @return Total tumbuhan yang dikonsumsi di Zoo.
   */
  public int getTotalPlant() {
    return totalPlant;
  }

  /**
   * Interface untuk menampilkan konsumsi total
   * daging dan tanaman di Zoo.
   */
  public void displayTotalFood() {
    System.out.print("\033[H\033[2J");
    System.out.flush();

    calculateTotalFood();

    System.out.println("Consumed food:");
    System.out.println(String.format("Meat\t%d kg", totalMeat));
    System.out.println(String.format("Plant:\t%d kg", totalPlant));

    System.out.println("\nPress enter to continue");
    new Scanner(System.in).nextLine();
  }

  /**
   * Menghitung jumlah makanan yang dikonsumsi di Zoo.
   */
  public void calculateTotalFood() {
    for (Cage c : zoo.getCages()) {
      for (Animal a : c.getAnimal()) {
        AnimalDiet d = a.getAnimalDiet();
        int currMeat = d.getReqMeat();
        int currPlant = d.getReqPlant();

        if (currMeat > 0) {
          totalMeat += currMeat;
        } else if (currPlant > 0) {
          totalPlant += currPlant;
        }
      }
    }
  }
}

package virtualzoo.zoo;

import java.util.Scanner;
import virtualzoo.animal.Animal;
import virtualzoo.animal.diet.AnimalDiet;

/**
 * Kelas ZooFood merupakan kelas untuk memfasilitasi
 * perhitungan makanan yang dkonsumsi di Zoo
 *
 * @author Felix Limanta - 13515065
 * @version 3.0
 * @since   3.0
 */
public class ZooFood {
  private int totalMeat;
  private int totalPlant;

  public ZooFood(Zoo zoo) {
    totalMeat = 0;
    totalPlant = 0;

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

  public int getTotalMeat() {
    return totalMeat;
  }

  public int getTotalPlant() {
    return totalPlant;
  }

  public void printTotalFood() {
    System.out.print("\033[H\033[2J");
    System.out.flush();

    System.out.println("Consumed food:");
    System.out.println(String.format("Meat\t%d kg", totalMeat));
    System.out.println(String.format("Plant:\t%d kg", totalPlant));

    System.out.println("\nPress enter to continue");
    new Scanner(System.in).nextLine();
  }
}

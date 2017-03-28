package virtualzoo;

/**
 * Kelas utama Virtual Zoo
 *
 * @author Felix Limanta - 13515065
 * @version 3.0
 * @since 3.0
 */
public class VirtualZoo {

  /**
   * Program utama.
   * @param args Command line argument.
   */
  public static void main(String[] args) {
    try {
      new Driver();
    } catch (Exception e) {
      System.err.println("Error: " + e.getMessage());
    }
  }
}
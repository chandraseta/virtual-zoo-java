package virtualzoo;

public class VirtualZoo {
  public static void main(String[] args) {
    try {
      new Driver();
    } catch (Exception e) {
      System.err.println("Error: " + e.getMessage());
    }
  }
}

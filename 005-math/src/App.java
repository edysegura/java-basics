import static java.lang.Math.floor;
import static java.lang.Math.random;

public class App {
  public static void main(String[] args) {
    String[] names = { "Davi", "Lidy", "Edy", "Edna", "Lúcio", "Regina", "Marquinho" };
    int[] counters = { 0, 0, 0, 0, 0, 0, 0 };

    for (int i = 0; i < 1000; i++) {
      int randomNumber = (int) floor(random() * names.length);
      counters[randomNumber]++;
    }

    System.out.println("---------------------------------------------------");

    for (int i = 0; i < names.length; i++) {
      String output = String.format("%d votes for %s", counters[i], names[i]);
      System.out.println(output);
    }
  }

}

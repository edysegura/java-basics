import java.util.UUID;

public class App {
  public static void main(String[] args) {
    for (short i = 0; i < 11; i++) {
      String output = String.format("%2s) %s", i, UUID.randomUUID());
      System.out.println(output);
    }
  }
}

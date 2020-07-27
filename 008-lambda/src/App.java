import java.util.Arrays;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Davi", "Lidy", "Edy");

    names
      .stream()
      .map(App::decorate)
      .forEach(System.out::println);

    names.forEach(System.out::println);
  }

  public static String decorate(String name) {
    return String.format("---> %s <---", name.toUpperCase());
  }

}

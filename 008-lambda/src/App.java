import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("Davi");
    names.add("Lidy");
    names.add("Edy");

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

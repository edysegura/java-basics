import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Davi");
        names.add("Lidy");
        names.add("Edy");

        names.forEach(name -> System.out.println(name));
    }
}

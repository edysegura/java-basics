public class App {
  public static void main(String[] args) {
    Printer printer = () -> {
      System.out.println("Printer simulator!");
    };

    printer.print();
  }
}

public class App {
  public static void main(String[] args) {
    Printer printer = (output) -> {
      System.out.println("Printer simulator! Output: " + output);
    };

    printer.print("Hi there!");

    Contact contact = new Contact("Edy Segura", "test@email.com");
    printer.print(contact);
  }
}

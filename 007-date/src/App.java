import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
  public static void main(String[] args) throws Exception {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    Date today = new Date();
    System.out.println("Today: " + dateFormat.format(today));

    String birthDate = "11/03/2018";
    Date birth = dateFormat.parse(birthDate);
    System.out.println("Birthdate: " + birth);
  }
}

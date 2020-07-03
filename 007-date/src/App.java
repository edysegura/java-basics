import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {

  static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

  public static void main(String[] args) throws Exception {
    dateFormatExample();
    calendarExample();
  }

  private static void calendarExample() {
    Calendar calendar = new GregorianCalendar();
    calendar.set(Calendar.DAY_OF_MONTH, 28);
    // the month below is February, in java month start with zero
    calendar.set(Calendar.MONTH, 1);
    calendar.set(Calendar.YEAR, 2019);
    System.out.println("February last day: " + dateFormat.format(calendar.getTime()));

    calendar.add(Calendar.DAY_OF_MONTH, 1);
    System.out.println("Handle data with calendar: " + dateFormat.format(calendar.getTime()));
  }

  private static void dateFormatExample() throws ParseException {
    Date today = new Date();
    System.out.println("Today: " + dateFormat.format(today));

    String birthDate = "11/03/2018";
    Date birth = dateFormat.parse(birthDate);
    System.out.println("Son's Birthdate: " + birth);
  }

}

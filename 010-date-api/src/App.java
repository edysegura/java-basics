import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class App {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1983, Month.SEPTEMBER, 14);
        int age = Period.between(birthDate, LocalDate.now()).getYears();
        System.out.println(String.format("He is %d years old", age));
    }
}

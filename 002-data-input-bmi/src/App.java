import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Name: ");
    String name = input.nextLine();

    System.out.println("Weight: ");
    int weight = input.nextInt();

    System.out.println("Height: ");
    float height = input.nextFloat();

    float bmi = weight / (height * height);
    input.close();

    System.out.println("----> " + name);
    System.out.println("BMI is " + bmi);
  }
}

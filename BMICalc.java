import java.util.Scanner;

public class BMICalc
{
  public static void main ( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);

    double heightMeters;
    int weightKg;

    System.out.println("Please enter in the following information, so your BMI can be calculated.");

    System.out.print("Your height in m: ");
    heightMeters = keyboard.nextDouble();

    System.out.print("Your weight in kg: ");
    weightKg = keyboard.nextInt();

    double bmi = weightKg / (heightMeters * heightMeters);

    System.out.print("Your BMI is " + bmi);
  }
}

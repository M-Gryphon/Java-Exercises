import java.util.Scanner;

public class NameAgeAndSalary
{
  public static void main ( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);

    String name;
    int age;
    double salary;

    System.out.println("What is your name?");
    name = keyboard.next();

    System.out.println("Hello " + name + "! How old are you?");
    age = keyboard.nextInt();

    System.out.println("So you are " + age + "? That's not old at all! \n How much do you make, " + name + "?");
    salary = keyboard.nextDouble();

    System.out.println(salary + "! I hope that's per hour and not per year!");

  }
}

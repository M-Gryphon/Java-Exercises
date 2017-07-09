import java.util.Scanner;

public class HowOldAreYou
{
  public static void main ( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);

    int age;
    String name;

    System.out.print("Hey, what's your name? ");
    name = keyboard.next();

    System.out.print("Ok, " + name + ", how old are you? ");
    age = keyboard.nextInt();

    if (age < 16)
    {
      System.out.println("You can't drive, " + name + ".");
    } else if (age < 18) {
      System.out.println("You can't vote, " + name + ".");
    } else if (age < 25) {
      System.out.println("You can't rent a car, " + name + ".");
    } else {
      System.out.println("You can do anything " + name + " that's legal.");
    }
  }
}

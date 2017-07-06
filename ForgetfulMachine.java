import java.util.Scanner;

public class ForgetfulMachine
{
  public static void main ( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Give me a word!");
    keyboard.next();

    System.out.println("Give me another word!");
    keyboard.next();

    System.out.println("Give me a number!");
    keyboard.nextInt();

    System.out.println("Give me another number!");
    keyboard.nextInt();

    System.out.println("That was fun! Goodbye.");
  }

}

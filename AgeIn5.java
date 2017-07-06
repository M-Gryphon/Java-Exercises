import java.util.Scanner;

public class AgeIn5
{
  public static void main ( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);

    int age;
    String name;

    System.out.print("Hello. What is your name? ");
    name = keyboard.next();

    System.out.print("Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();

    int ageIn5 = age + 5, ageMinus5 = age - 5;

    System.out.println("Did you know that in five years you will be " + ageIn5 + " years old? \nAnd five years ago you were " + ageMinus5 + "! Imagine that!");
  }
}

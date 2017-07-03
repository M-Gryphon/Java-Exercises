public class MoreVariablesAndPrinting
{
  public static void main ( String[] args )
  {
    //Declare variables
    String name, eyes, teeth, hair;
    int age, height, weight;

    //Initialize variables
    name = "Gregory Griffin";
    age = 100;    // obviously not my real age
    height = 74;  // inches
    weight = 180; // lbs
    eyes = "Brown";
    teeth = "White";
    hair = "Brown";

    //Print out strings and the value of variables
    System.out.println("Let's talk about " + name + ".");
    System.out.println("He's " + height + " inches tall.");
    System.out.println("He's " + weight + " pounds heavy.");
    System.out.println("Actually, that's not too heavy.");
    System.out.println("He's got " + eyes + " eyes and " + hair + " hair." );
    System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

    //Print out strings, the value of variables, and calculate the sum of age, height, and weight.
    System.out.println("If I add " + age + ", " + height + ", and " + weight + " I get " + (age + height + weight) + ".");
  }
}

import java.util.Scanner;

public class MoreUserInputOfData
{
  public static void main ( String[] args )
  {
    Scanner keyboard = new Scanner(System.in);

    int grade, studentId;
    double gpa;
    String firstName, lastName, login;

    System.out.println("Please enter the following information, so I can Mr. Robot you! Obviously, this is a joke.");

    System.out.print("First name: ");
    firstName = keyboard.next();

    System.out.print("Last name: ");
    lastName = keyboard.next();

    String fullName = lastName + ", " + firstName;

    System.out.print("Grade (9-12): ");
    grade = keyboard.nextInt();

    System.out.print("Student ID: ");
    studentId = keyboard.nextInt();

    System.out.print("Login: ");
    login = keyboard.next();

    System.out.print("GPA (0.0-4.0): ");
    gpa = keyboard.nextDouble();

    System.out.println(" \nYour information: \n\tLogin: " + login + "\n\tID: " + studentId + "\n\tName: " + fullName + "\n\tGPA: " + gpa + "\n\tGrade: " + grade);

  }
}

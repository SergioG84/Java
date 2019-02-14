import java.util.Scanner;

public class averageInput {
  public static void main (String [] args){

    Scanner input = new Scanner(System.in);

    double num1;
    double num2;
    double num3;

    System.out.println("I will find the average of three numbers");

    System.out.print("Enter a number: ");
    num1 = input.nextDouble();
    System.out.print("Enter a number: ");
    num2 = input.nextDouble();
    System.out.print("Enter a number: ");
    num3 = input.nextDouble();

    double average = (num1 + num2 + num3) / 3;

    System.out.println("The average of the numbers are: " + average);

  }
}

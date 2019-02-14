import java.util.Scanner;

public class ComputeAreaInput {
  public static void main (String[]args){

    Scanner input = new Scanner(System.in);

    double length;
    double width;
    double area;

    System.out.println("Enter a length: ");
    length = input.nextDouble();

    System.out.println("Enter a width: ");
    width = input.nextDouble();

    area = length * width;

    System.out.println("The area is: " + area);    
  }
}

import java.util.Scanner;

public class tempConv {
  public static void main (String[]args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a temperature in Far: ");
    double Far = input.nextDouble();

    double Cel = (5.0/9) * (Far - 32);

    System.out.println("The temperature in cel is: " + Cel);
  }
}

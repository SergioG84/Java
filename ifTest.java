import java.util.Scanner;

public class ifTest{
  public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter a radius to find area of circle: ");
    double radius = input.nextDouble();

    if (radius >= 0){
      double area = radius * radius * 3.14;
      System.out.println("The circle's area is: " + area);
    }else{
      System.out.println("Thats a negative number!");
    }
  }
}

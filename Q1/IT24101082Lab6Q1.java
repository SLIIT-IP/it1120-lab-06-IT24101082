import java.util.Scanner;
public class IT24101082Lab6Q1 {
  public static void main(String[] args ) {

  Scanner input = new Scanner(System.in);
  System.out.print("enter a number:");
  double number =input.nextDouble();		
  
  double square = number*number ;	
  double squareroot = Math.sqrt(number);
  System.out.println("square of " + number +" is "+ square );
  System.out.println ("square root of " +number + "is" + squareroot);
  
 }
}
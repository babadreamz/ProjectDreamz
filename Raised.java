import java.util.Scanner;
public class Raised{
public static void main (String [] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter base number: ");
double num1 = scan.nextDouble();
System.out.println("Enter the exponent: ");
double num2 = scan.nextDouble();
double poweR = 1.0;
for(int counter = 1; counter <= num2; counter = counter + 1){
		poweR = poweR * num1;
	}
	System.out.printf("%.1f raised to the power of %.1f is equal to %.1f%n", num1, num2, poweR);



}
}
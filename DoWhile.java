import java.util.Scanner;
public class DoWhile{
public static void main(String [] args){

Scanner scan = new Scanner(System.in);
String userChoice;
	do{
	System.out.println("Enter two numbers: ");
	double num1 = scan.nextDouble();
	double num2 = scan.nextDouble();
	
	double sum = num1 + num2;
	System.out.printf("%.1f and %.1f is equal to %.1f %n", num1, num2, sum);
	scan.nextLine();		

	System.out.println("Do you wish to perform the operation again? (yes/no)");

	userChoice = scan.nextLine();
	} 
	while(userChoice.equalsIgnoreCase("yes"));
	System.out.println("The end");






}
}


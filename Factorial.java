import java.util.Scanner;

public class Factorial{
public static void main(String [] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter a number: ");
int num = scan.nextInt();

int counter = 1;
int factorial = 1;
	if (num < 0){
	System.out.println("Enter a valid number");
		}
	while(counter <= num){
		factorial = factorial * counter;
		counter = counter + 1;
		}
	System.out.printf("%d is %d!%n", num, factorial);

}
}
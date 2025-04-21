import java.util.Scanner;
public class Prime{
public static void main(String [] args){

Scanner scan = new Scanner(System.in);

System.out.println("Enter any number: ");
int num = scan.nextInt();

boolean isPrime = true;

if(num < 2){
	isPrime = false;
	}else{
		int counter = 2; 
		while(counter <= num/2){
			if(num % counter==0){
			isPrime = false;
			break;
			}
		counter = counter + 1;
		}
	
	}
	if(isPrime){
		System.out.printf("%d is a prime number", num);
		}else{
		System.out.printf("%d is not a prime number", num);
			}




}
}


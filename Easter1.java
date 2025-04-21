import java.util.Scanner;
import java.util.Random;
public class Chibuzor{
public static void main (String [] args){

Scanner lotanna = new Scanner(System.in);
Random random = new Random();

int compGuess = random.nextInt(11);
int chance  = 0;
int maxGuess = 3;

while(chance < max Guess){
	System.out.println("Enter a number between 1-10: ");
	int userGuess= lotanna.nextInt();
	
	if ((userGuess <1 || userGuess>10 )){
	System.out.printf("Invalid number %n");
	}else{ if(userGuess == compGuess){
		System.out.println("Correct");
		}
		else if(userGuess != compGuess){
			if(userGuess > compGuess){
				System.out.println("Too high");
				}else{
					System.out.println("Too low");
				}
			}
}
chance = chance + 1;	}	
	System.out.println("The End!");
}

}
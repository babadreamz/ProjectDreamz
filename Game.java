import java.util.Scanner;
import java.util.Random;

public class Game{
public static void main(String [] args){

Scanner scan = new Scanner(System.in);
Random random = new Random();

int compChoice = random.nextInt(3);;
System.out.println("scissor (0), rock(1), paper (2): ");
int userChoice = scan.nextInt();

if((userChoice < 0 ) || (userChoice > 2)){
	System.out.println("Invalid input");
	} else{

System.out.print("The computer is ");

//Computer's logic
if(compChoice == 0){
	System.out.print("Scissor. ");
	}else if(compChoice == 1){
	System.out.print("rock. ");
	}
	else if(compChoice == 2){
	System.out.print("paper. ");
	}

// user"s logic
System.out.print("Your are ");
if(userChoice == 0){
	System.out.print("scissor .");
	}else if(userChoice == 1){
	System.out.print("rock .");
	}else if(userChoice == 2){
	System.out.print("paper .");
	}

//winning condition

if(userChoice == compChoice){
	System.out.print("too. It is a draw");
	}else if((userChoice == 0 && compChoice == 2)){
		System.out.print("You won");
		}
	else if((userChoice == 1 && compChoice == 0)){
		System.out.print("You won");
		}
	else if((userChoice ==2 && compChoice == 1)){
		System.out.print("You won");
		} else {System.out.print("You lost");}
		
	}







}
}
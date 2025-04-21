import java.util.Scanner;

public class Table{
public static void main(String [] args){

Scanner scan = new Scanner(System.in);

System.out.println("a    " +"b    " + "pow(a, b)" );
int a = 1;
int b = 2;

	while(a<=5){
	double poweR = Math.pow(a, b);
	int intPower = (int) poweR;
	System.out.println(a + "    " + b + "    " + intPower);
	a = a + 1;
	b = b + 1;
	}









}
}

import java.util.*;
 
class Factorial{

	public static void main(String args[]){

		Scanner sc  =  new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();

		long factorial = 1;

		for(int i = 1 ; i <= num ; i++){
			factorial *= i;
		}

		System.out.println("Factorial of your number is : "+ factorial);
	
	}

}

import java.util.*;
 
class PowerNum {

	public static void main(String args[]){

		Scanner sc  =  new Scanner(System.in);
		System.out.print("Enter the Base Number");
		int Base = sc.nextInt();

		System.out.print("Enter the exponent Number");
		int exponent = sc.nextInt();
		
		double res = Math.pow(Base,exponent);
		System.out.println(Base + " raised to the power of " + exponent + " is " + res);


	
	}

}
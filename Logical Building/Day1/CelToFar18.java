
import java.util.*;
 
class CelToFar {

	public static void main(String args[]){

		Scanner sc  =  new Scanner(System.in);
		System.out.print("Enter the Temperature in Celcius : ");
		int cls = sc.nextInt();

		float far = (cls * 9/5) + 32;
		
		System.out.print(cls +" Celcius is equal to "+far+"F");


	
	}

}
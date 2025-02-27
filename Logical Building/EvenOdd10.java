
import java.util.*;

class EvenOdd{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number to Check Even/odd : ");
		int num = sc.nextInt();
	
		if(num % 2 == 0){
			System.out.println("Your number is even");
		}else{
			System.out.println("Your Number is Odd");
		}
	}

}
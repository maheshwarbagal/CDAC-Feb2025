
import java.util.*;
 
class PrimeNumber {

	public static void main(String args[]){

		Scanner sc  =  new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();

		if(num % num == 0 && num % 1 ==0){
			System.out.println("The Number is a Prime Number");
		}else{
			System.out.println("The number is not a Prime");
		}
	
	}

}
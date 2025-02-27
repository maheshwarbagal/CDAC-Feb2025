

import java.util.*;

class PositiveNum{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();

		if(num <= 0){
			System.out.println("The Number is Negative");
		}else{

			System.out.println("The Number is Positive");
		}
	
	}

}
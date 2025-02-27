
import java.util.*;

class Discount{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Billing Amount : ");
		double amt = sc.nextDouble();

		double discount20 = amt * (20.0/100);
		double discount10 = amt * (10.0/100);
		double discount5 = amt * (5.0/100); 

		if(amt >= 1000){
			amt = amt - discount20;
			System.out.println("Your Amount after Discount is : "+ amt);
					

		}else if(amt >= 500 && amt < 1000){
		
			amt -= discount10;
			System.out.println("Your Amount after Discount is : "+ amt);
	
		}else{

			amt -= discount5;
			System.out.println("Your Amount after Discount is : "+ amt);
			
		}
		
	
	}

}
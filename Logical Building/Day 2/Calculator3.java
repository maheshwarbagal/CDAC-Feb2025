
import java.util.*;

class Calculator{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the First Number : ");
		int num1 =sc.nextInt();

		System.out.println("Enter the Second Number : ");
		int num2 =sc.nextInt();
		
		System.out.println("Enter the Operand : ");
		String opr =sc.next();

		switch(opr){
			case "+" : 
				System.out.println("The Sum of your Number is : "+ (num1 + num2));
				break;

			case "-" :  
				System.out.println("The Substraction of your Numbers is : "+ (num1 - num2));
				break;	
			case "/" :  
				if(num1 == 0 || num2 == 0){
					System.out.println("The Division with Zero is not possible");

				}else{
					System.out.println("The Division of your Number is : "+(num1/num2));
				}
				break;	
			case "*" :  
				System.out.println("The Multiplication of your Number is : "+ (num1 * num2));
				break;	
			default:
					
				System.out.println("Invalid Input");
			
			
			
		}
		
	
	}

}
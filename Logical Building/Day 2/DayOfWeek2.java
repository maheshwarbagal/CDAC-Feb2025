
import java.util.*;

class DayOfWeek{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the Day Number : ");
		int day =sc.nextInt();

		switch(day){
			case 1 : 
				System.out.println("Monday is a Weekday");
				break;

			case 2 :  
				System.out.println("Tuesday is a Weekday");
				break;	
			case 3 :  
				System.out.println("Wednesday is a Weekday");
				break;	
			case 4 :  
				System.out.println("Thursday is a Weekday");
				break;	
			case 5 :  
				System.out.println("Friday is a Weekday");
				break;	
			
			case 6 :  
				System.out.println("Saturday is a Weekend");
				break;	
			case 7 :  
				System.out.println("Sunday is a Weekend");
				break;
			default:
					
				System.out.println("Invalid Input");
			
			
			
		}
		
	
	}

}

import java.util.*;

class GradeClassification{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the Marks Scored : ");
		double marks = sc.nextDouble();

		if(marks >= 90){
			System.out.println("You Achieve Grade A");	
		}else if(marks >= 80 && marks < 90){
			System.out.println("You Achieve Grade B");
		}else if(marks >= 70 && marks < 80){
			System.out.println("You Achieve Grade C");
		}else if(marks >= 60 && marks < 70){
			System.out.println("You Achieve Grade D");
		}else{
			System.out.println("You Achieve Grade F ");
		}
		
	
	}

}
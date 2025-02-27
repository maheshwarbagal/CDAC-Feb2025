
import java.util.*;

class PassFail{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Subject 1 Marks:  ");
		int Sub1 = sc.nextInt();

		System.out.print("Enter the Subject 2 Marks:  ");
		int Sub2 = sc.nextInt();

		System.out.print("Enter the Subject 1 Marks:  ");
		int Sub3 = sc.nextInt();

		int failSubjects = 0;

		if(Sub1 <= 40){
			failSubjects++;		

		}else if(Sub2 <= 40){
		
			failSubjects++;
	
		}else if(Sub3 <= 40){

			failSubjects++;
		}else{
			System.out.println("You got failed in : "+failSubjects+" Subjects");
		}
	
	}

}
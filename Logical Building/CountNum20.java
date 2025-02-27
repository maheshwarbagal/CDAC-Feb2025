
import java.util.*;
 
class CountNum {

	public static void main(String args[]){

		Scanner sc  =  new Scanner(System.in);
		System.out.print("Enter the Number");
		int Num = sc.nextInt();

		int count = 0 ;
		int temp = Math.abs(Num);

		if(temp == 0){
			count = 1;
		}else{

			while(temp > 0){
				temp /= 10;
				count++;
			}	
	
		}
		System.out.println("The Digit in the Number are : "+count);


	
	}

}
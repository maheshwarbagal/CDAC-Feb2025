
import java.util.*;

class LargestNum{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number ");
		int num1 = sc.nextInt();
	
		System.out.print("Enter the Second Number ");
		int num2 = sc.nextInt();

		System.out.print("Enter the Third Number ");
		int num3 = sc.nextInt();

		if(num1 > num2){
			System.out.println(num1);
		}else if(num2 > num3){
			System.out.println(num2);
		}else if(num3 > num1){
			System.out.println(num3);
		}
	}

}
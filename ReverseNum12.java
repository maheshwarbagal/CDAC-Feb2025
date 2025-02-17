
import java.util.*;

class ReverseNum{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number ");
		int num = sc.nextInt();

		int res = reverseDigit(num);
		System.out.println(res);
	
			
	}

	public static int reverseDigit(int n){

		int revNum = 0;
		while(n > 0){

			revNum = revNum * 10 + n % 10;
			n = n / 10;
		}
		return revNum;

	}

}
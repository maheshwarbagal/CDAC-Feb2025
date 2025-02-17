
import java.util.*;

class Average{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number");
		int num1 = sc.nextInt();

		System.out.println("Enter the Second Number");
		int num2 = sc.nextInt();

		System.out.println("Enter the Third Number");
		int num3 = sc.nextInt();

		System.out.println(average(num1,num2,num3));
	}

	public static int average(int n1,int n2,int n3){

		int res = (n1 + n2 + n3)/3;
		return res;

	}

}
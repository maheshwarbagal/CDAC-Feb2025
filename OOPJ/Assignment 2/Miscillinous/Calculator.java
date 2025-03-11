import java.util.*;

class Calculator{

	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first the Number : ");
		int num1 = sc.nextInt();

		System.out.println("Enter the Second Number : ");
		int num2 = sc.nextInt();

		System.out.println("Enter the. Operator : ");
		String opr = sc.next();

		switch(opr){
			case "+":
				System.out.println("The Addition of your num is : "+(num1+num2));
				break;
			case "-":
				System.out.println("The Substraction of your num is : "+(num1-num2));
				break;
			case "/":
				System.out.println("The Substraction of your num is : "+(num1-num2));
				break;
			case "*":
				System.out.println("The Substraction of your num is : "+(num1-num2));
				break;
			case "%":
				System.out.println("The Substraction of your num is : "+(num1-num2));
				break;
			default:
				System.out.println("Invalid Operand");
		}
	}

}
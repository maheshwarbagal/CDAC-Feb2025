class SumOfDigits{

	public static void main(String []args){
		 
		 int num = 9876;
		 int sum = 0;

		while(num > 0 ){
			int lastDigit = num % 10; //get last digit
			sum += lastDigit; //add last digit to sum
			num = num / 10;//skip the last digit which is used
		}
		
		System.out.println("Sum of the Digit is : "+sum);
		

	}
	

	

}
class SumOfDigit{

	public static void main(String [] args){
		int num = 23123;
		int sum = 0;

		while(num > 0){

			sum += num % 10; // last digit
			num /= 10;// skip digit which has been added 
		
		}

		System.out.println("The sum of digit of num is : "+sum);
	}

}
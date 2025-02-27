class ReverseDigit{

	public static void main(String []args){

		int n = 1234;
		System.out.println(reverse(n));

	}

	public static int reverse(int n){
		
		int reverse = 0;
		while(n != 0){
			int remainder = n % 10;//we get last digit
			reverse = reverse * 10 + remainder;//add last digit in reverse
			n = n / 10;//skip that digit which is added in reverse
		}
		return reverse;
	}

}
class ReverseNum{
	
	public static void main(String []args){
		int n = 345352;
		int rev = 0;
		
		while(n != 0){
			int digit = n % 10;
			rev = rev * 10 + digit;
			n /= 10;
		}
		System.out.println("Reverse Number : "+rev);
	}

}
class LargestDigit{

	public static void main(String []args){
		int n = 4825;		
		int digit = 0;

		 
		while( n > 0 ){
			int lastdigit = n % 10;
			if(lastdigit > digit){
				digit = lastdigit;
			}
			n /= 10;
		}
		System.out.println(digit);
		
		
		

	}
	

	

}
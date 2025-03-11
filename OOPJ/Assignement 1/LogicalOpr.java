class LogicalOpr{
	public static void main(String [] args){

		int n = 24;
		
		if(!(n>=0)){
		
			System.out.println("Negative Number");
		}

		if(n % 2 == 0 && (n >= 0)){
			System.out.println("The Number is Positive and Even");
		}else{

			System.out.println("The Number is odd");
		}
	}

}
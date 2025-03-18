class ArithmeticExp{

	public static void main(String args[]){
		int a = 12;
		int b = 0;

		try{
			int res = a/b;
		}catch(ArithmeticException e){
			e.getMessage();
			System.out.println("Divide by Zero is not possible");
		}
	}

}
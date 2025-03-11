class Power{

	public static void main(String args[]){

		int num = 3;

		boolean res = (num > 0) && ((num & (num-1)) == 0);
	
		System.out.println("The "+ num + " is "+(res ? " is Power of 2" : " is not power of 2"));
	}

}
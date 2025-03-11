class EvenOddBit{

	public static void main(String args[]){
		int num = 5;
		
		String res = ((num & 1) == 0) ? "Even" : "Odd";

		System.out.println(res);
	}

}
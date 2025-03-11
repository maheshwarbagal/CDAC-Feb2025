class Ternary{

	public static void main(String args[]){

		int a = 4;
		int b = 6;
		int c = 2;

		String res = (a > b && a > c) ? (a +" is Greater") 
				: (b > c && b > a) ? (b+" is greater ") 
				: (c+" is greater");

		System.out.println(res);
	}

}
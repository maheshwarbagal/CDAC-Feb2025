class Factorial{

	public static void main(String [] args){
		int n = 10;
		int fact = 1;

		for(int I = n ; I >= 1 ; I--){
			fact *= I;

		}
		System.out.println(fact);

	}

}
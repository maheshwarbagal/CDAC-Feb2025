class MinNum{

	public static void main(String []args){
	
		int a = 4;
		int b = 3;
		int c = 9;
		int d = 6;

		String res = ((a < b) && (a < c) && (a < d)) ? (a+" is Minimum") 
			: ((b < a) && (b < c) && (b < d)) ? (b+" is Minimum") 
			: ((c < a) && (c < b) && (c < d) ? (c+" is Minimum")
			: (d+" is Minimum"));


		System.out.println(res);
	
	}

}
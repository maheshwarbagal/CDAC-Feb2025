class DoubleInt{
	public static void main(String [] args){
		double d = 24.5356;
		System.out.println("The value of Double is :"+d);

		// The data loss occurs after decimal point while converting double to Int.
		int res = (int) d;// here we do Explicit casting
		System.out.println("The value after Explicit type casting is : "+res);
	}
}
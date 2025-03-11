class DataType{

	static int defaultInt;
	static float defaultFloat;
	static char defChar;
	static double defDouble;
	static long defLong;
	static boolean defBoolean;
	
	
	public static void main(String [] args){
		int a = 10;
		float f = 10.02f;
		char ch = 'c';
		double d = 14.534338d;
		long l = 1043422445356L;
		boolean b = true;

		System.out.println("Default int : "+defaultInt);
		System.out.println(a);
		System.out.println("Default float : "+defaultFloat);
		System.out.println(f);
		System.out.println("Default char : "+defChar);
		System.out.println(ch);
		System.out.println("Default double : "+defDouble);
		System.out.println(d);
		System.out.println("Default Long : "+defLong);
		System.out.println(l);
		System.out.println("Default Boolean : "+defBoolean);
		System.out.println(b);
	}

}
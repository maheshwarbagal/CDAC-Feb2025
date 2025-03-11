class Increment{

	public static int increment(int n){
		return -(~n);
	}

	public static void main(String []args){
		int num =5;
			
		int IncremntNum = increment(num);
		
		System.out.println("Increment no : "+IncremntNum);
	
	}

}
class AbsValue{

	public static void main(String [] args){
		int num = -20;

		int mask = num >> 31;
		int abs = (num + mask) ^ mask;

		System.out.println(abs);		
				
	}

}
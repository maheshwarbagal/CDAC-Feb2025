class Auto_Unboxing{
	public static void main(String args[]){
		int a = 10;
		Integer I = Integer.valueOf(a);//AutoBoxing
		System.out.println(I);

		Integer d = 30;
		int j = d; //unboxing
		System.out.println(j);		

	}

}
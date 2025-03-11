class SwapNum{

	public static void main(String [] args){

		int a =20;
		int b = 5;
		System.out.println(a);
		System.out.println(b);
		
		a += b;//a = 25
		b = a - b;//25 - 5 = 20
		a -= b;//25 - 20

		System.out.println(a);
		System.out.println(b);	

	}

}
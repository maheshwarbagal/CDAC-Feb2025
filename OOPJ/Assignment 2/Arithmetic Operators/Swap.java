class Swap{
	public static void main(String [] args){
		int a = 5;
		int b = 4;

		a = a ^ b ;//a = 1
		System.out.println("A : "+a);
		b = a ^ b;//b = 5
		System.out.println("B : "+b);
		a = a ^ b;//4
		System.out.println("A : "+a);

	}

}
/*

0 1 0 1		0 0 0 1		0 0 0 1	
0 1 0 0		0 1 0 0		0 1 0 1
--------	--------	--------
0 0 0 1		0 1 0 1		0 1 0 0
*/
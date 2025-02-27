class Fibonacci{

	public static void main(String []args){
		int n = 21;
		int a = 0;
		int b = 1;
		
		System.out.print(a+ " ");
		System.out.print(b+" ");
		for(int c = a + b ; c <= n ; c = a + b){
			System.out.print(c+ " ");
			a = b;
			b = c;
			
					
		}
		

	}

	

}
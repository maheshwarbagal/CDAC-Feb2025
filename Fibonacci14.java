


class Fibonacci{

	public static void main(String args[]){

		int count = 10;
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1 + " ");
		System.out.print(n2+ " ");

		

		for(int i = 2 ; i < count ; i++){
			int next = n1 + n2;
			System.out.print(next+ " " );
			n1 = n2;
			n2 = next;
		}

	}

}
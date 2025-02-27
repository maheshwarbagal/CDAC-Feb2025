class PrimeNum{

	public static void main(String []args){
		 int count = 0;
		 int num = 2;

		while(count < 6){
			if(isPrime(num)){
				System.out.print(num + " ");
				count++;
			}
			num++;
		}
		
		

	}
	public static boolean isPrime(int n){
		if(n < 2){
			return false;
		}
		for (int I = 2 ; I * I <= n ; I++){
			if(n % I == 0){
				return false;
			}
			
		}
		return true;
	}

	

}
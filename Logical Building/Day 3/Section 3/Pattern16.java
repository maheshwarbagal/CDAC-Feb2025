class Pattern15{

	public static void main(String []args){
		int n = 5;
		for(int I = 1 ; I <= n ; I++ ){
			for(int j = 1 ; j <= n - I; j++ ){
				System.out.print(" ");
				
			}

			for(int k = 1; k <= 2 * I -1 ;k++){
				System.out.print("*");
			}
			
			System.out.println();		
		}
		
	}
	

}

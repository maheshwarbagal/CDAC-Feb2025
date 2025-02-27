class Pattern15{

	public static void main(String []args){
		int n = 6;
		for(int I = 0 ; I < n ; I++ ){
			for(int j = n - I - 1 ; j >= 1 ; j-- ){
				System.out.print(" ");
				
			}

			for(int k = 0; k <= I ;k++){
				System.out.print("* ");
			}
			
			System.out.println();		
		}
		
	}
	

}
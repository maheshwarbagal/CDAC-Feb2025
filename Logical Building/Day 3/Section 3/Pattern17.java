class Pattern17{

	public static void main(String []args){
		int n = 6;
		for(int I = 0 ; I < n ; I++ ){
			for(int j = 0 ; j < I ; j++ ){
				System.out.print(" ");
				
			}

			for(int k = I; k < n ;k++){
				System.out.print("* ");
			}
			
			System.out.println();		
		}
		
	}
	

}
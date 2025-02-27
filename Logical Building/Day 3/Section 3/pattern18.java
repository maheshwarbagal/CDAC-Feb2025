class Pattern18{

	public static void main(String []args){
		int n = 6;
		for(int I = 0 ; I < n ; I++ ){
			for(int j = 0 ; j < n - I - 1; j++ ){
				System.out.print(" ");
				
			}

			for(int k = 0; k <= I ;k++){
				System.out.print("* ");
			}
			
			System.out.println();		
		}
		for(int I = 0 ; I < n -1 ; I++ ){
			for(int j = 0 ; j <= I; j++ ){
				System.out.print(" ");
				
			}

			for(int k = 0; k < n - I -1 ;k++){
				System.out.print("* ");
			}
			
			System.out.println();		
		}
		
	}
	

}
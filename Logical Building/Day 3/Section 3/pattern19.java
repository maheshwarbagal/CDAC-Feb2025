class Pattern19{

	public static void main(String []args){
		int n = 6;
		
		for(int I = 0 ; I < n ; I++){
			for(int j = 1 ; j <= I ; j++){
				System.out.print(j);
				if(j < I){
					System.out.print("*");	
				}
				
			}
			System.out.println();
		}
		
	}
	

}
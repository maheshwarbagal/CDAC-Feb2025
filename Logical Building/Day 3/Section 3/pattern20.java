class Pattern20{

	public static void main(String []args){
		int n = 6;
		
		for(int I = 1 ; I <= n ; I++){
			for(int j = 5 ; j >= 7 - I  ; j--){
				System.out.print(j);
				if(j > 7 - I){
					System.out.print("*");	
				}
				
			}
			System.out.println();
		}
		
	}
	

}
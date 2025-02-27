class Pattern13{

	public static void main(String []args){
		int n = 5;
		for(int I = 1 ; I <= n ; I++ ){
			for(int j = 1 ; j <= I ; j++ ){
				System.out.print(I);
				if(j < I){
					System.out.print("*");
				}
			}
			System.out.println();
			
				
		}
		for(int I = n ; I >= 1 ; I-- ){
			for(int j = 1 ; j <= I ; j++ ){
				System.out.print(I);
				if(j < I){
					System.out.print("*");
				}
			}
			
			System.out.println();
				
		}

	}
	

}

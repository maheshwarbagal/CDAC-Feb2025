class Pattern21{
	public static void main(String []args){
		int n = 5;
		int num = 1;

		for(int i = 1 ; i <= n; i++){
			int temp = num;
			for(int j = 1 ; j <= i ; j++){
				System.out.print(temp);
				if(j < i){
					System.out.print("*");
				}
				temp = temp + 2;
			}
			System.out.println();
		}
		
	}


}
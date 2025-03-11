class EvenNums{

	public static void main(String args[]){
		int n = 100;

		for(int I = 0 ; I <= n; I++){
			if((I & 1) == 0){
				System.out.println(I);
			}
		}
	}

}
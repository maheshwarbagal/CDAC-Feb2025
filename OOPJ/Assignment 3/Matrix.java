class Matrix{

	public static void main(String []args){
		int[][] arr = {{1,2,3,4,5,6},{2,3,4,5,6,7},{2,3,4,5,6,7}};

		for(int I = 0 ; I < arr.length; I++){
			for(int j = 0; j < arr[I].length; j++){
				System.out.print(arr[I][j]+" ");
	
			}
			System.out.println();
		}

	}

}
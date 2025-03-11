class MatrixMul{

	public static void main(String args[]){
		int [][]arr1 = {{4,6,7},{9,6,5},{4,1,3}};
		int [][]arr2 = {{5,4,6},{9,8,7},{1,3,2}};

		int[][]res = new int[arr1.length][arr2.length];

		for(int I = 0 ; I < arr1.length; I++){

			for(int j=0; j < arr2[I].length; j++){

				for(int k=0; k < arr1[I].length; k++){

					res[I][j] += (arr1[I][k] * arr2[k][j]);
				}
				

			}
		}
		for(int I = 0; I < res.length; I++){
			for(int j = 0; j < res[I].length; j++){
				System.out.print(res[I][j]+" ");
			}
			System.out.println();
		}

	}

}
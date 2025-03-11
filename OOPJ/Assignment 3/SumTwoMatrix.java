class SumTwoMatrix{

	public static void main(String []args){
		int [][]arr1 = {{1,2,3},{4,5,6},{6,7,8}};
		int [][]arr2 = {{9,8,7},{6,5,4},{3,2,1}};
		
		for(int I = 0; I < arr1.length; I++){
			for(int j=0; j< arr1[I].length; j++){
				System.out.print(arr1[I][j] + " ");
			}
			System.out.println();
		}
System.out.println();
		for(int I = 0; I < arr2.length; I++){
			for(int j=0; j< arr2[I].length; j++){
				System.out.print(arr2[I][j] + " ");
			}
			System.out.println();
		}
System.out.println();
		int n = arr1.length;
		int m = arr1[0].length;

		int [][]res = new int[n][m];

		for(int I=0; I < arr1.length; I++ ){

			for(int j = 0; j < arr2.length; j++){
				res[I][j] = arr1[I][j] + arr2[I][j];
			}
		}

		for(int I = 0; I < res.length; I++){
			for(int j=0; j< res[I].length; j++){
				System.out.print(res[I][j] + " ");
			}
			System.out.println();
		}

		


	}

}
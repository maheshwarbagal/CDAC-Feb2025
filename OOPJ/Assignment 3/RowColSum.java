class RowColSum{

	public static void main(String []args){
		int [][]arr1 = {{3,5,7},{9,7,6},{5,4,9}};
		int n = arr1.length;
		int m = arr1[0].length;

		for(int I = 0; I < n; I++){
			int rowSum = 0;
			for(int j = 0; j < arr1[I].length; j++){
				rowSum += arr1[I][j];
			}
			System.out.println("Row Sum of "+I+" row is : "+rowSum);
		}

		for(int j = 0; j < m; j++){
			int colSum = 0;
			for(int I=0; I < n; I++){
				colSum += arr1[I][j];
			}
			System.out.println("Row Sum of "+j+" col is : "+colSum);
		}

	}

}
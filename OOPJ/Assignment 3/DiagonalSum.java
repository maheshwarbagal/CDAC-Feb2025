class DiagonalSum{

	public static void main(String []args){
		int [][]arr = {{1,2,3},{4,5,6},{6,7,8}};
		int n = arr.length;

		int leftSum = 0;
		int rightSum = 0;

		for(int I = 0; I < n; I++){
			for(int j = 0; j < arr[I].length; j++){
				if(I == j){
					leftSum += arr[I][j];
				}
				if( I+j  == n-1){
					rightSum += arr[I][j];
				}
	
			}
		}
		System.out.println("Left Diagonal Sum : "+leftSum);
		System.out.println("Right Diagonal Sum : "+rightSum);
	}

}
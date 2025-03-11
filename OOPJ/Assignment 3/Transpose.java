class Transpose{

	public static void main(String []args){
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int n = arr.length;
		int m = arr[0].length;

		int [][] res = new int[n][m];
		
		for(int I=0; I < arr.length; I++){
			for(int j = 0; j< arr[I].length; j++){
				System.out.print(arr[I][j]);
			}
			System.out.println();
		}
		System.out.println();

		for(int I = 0; I < arr.length; I++){
			for(int j = 0; j < arr[I].length; j++){
				res[j][I] = arr[I][j];
			}
		}
		
		for(int I=0; I < res.length; I++){
			for(int j = 0; j< res[I].length; j++){
				System.out.print(res[I][j]);
			}
			System.out.println();
		}

		

		

	}

}
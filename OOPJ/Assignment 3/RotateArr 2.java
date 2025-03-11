class RotateArr{

	public static void main(String []args){
		int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
		int n = arr.length;
		
		for(int I = 0 ; I < arr.length; I++){
			for(int j=0; j< arr[I].length; j++){
				System.out.print(arr[I][j]+" ");
			}
		System.out.println();

		}

		System.out.println();
		for(int I=0; I<arr.length; I++){
			for(int j = I ; j < arr[I].length; j++){
				int temp = arr[I][j];
				arr[I][j] = arr[j][I];
				arr[j][I] = temp;
			}

		}
		System.out.println();

		for(int I = 0 ; I < arr.length; I++){
			for(int j=0; j< arr[I].length; j++){
				System.out.print(arr[I][j]+" ");
			}
		System.out.println();

		}

		System.out.println();

		for(int I = 0; I < arr.length; I++){
			for(int j = 0; j < n/2;j++){
				int temp = arr[I][j];
				arr[I][j] = arr[I][n-j-1];
				arr[I][n-j-1] = temp;
		
			}

		}

		for(int I = 0 ; I < arr.length; I++){
			for(int j=0; j< arr[I].length; j++){
				System.out.print(arr[I][j]+" ");
			}
		System.out.println();

		}
	
	}


}
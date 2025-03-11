import java.util.*;
class ZeroSumArr{

	public static void main(String []args){
		int arr[] = {1, 3, -7, 3, 2, 3, 1, -3, -2, -2};
		
		int n = arr.length;
			
		for(int I = 0; I < n; I++){
			int sum = 0;
			for(int j = I ; j < n ; j++){
				sum += arr[j];

				if(sum == 0){
					System.out.println("SubArray found : "+Arrays.toString(Arrays.copyOfRange(arr,I,j+1)));
				}

			}
			
		}

	}

}
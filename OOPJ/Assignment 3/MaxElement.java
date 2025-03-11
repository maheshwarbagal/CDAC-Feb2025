import java.util.*;

class MaxElement{

	public static void main(String args[]){
		int [][] arr = {{5,8,7},{2,4,3},{6,5,1}};

		int max = Integer.MIN_VALUE;

		for(int I = 0; I < arr.length; I++){
			for(int j = 0 ; j < arr[I].length ; j++){
				if(arr[I][j] >= max){
					max = arr[I][j];
				}
			}
		}
		System.out.println(max);

	}

}
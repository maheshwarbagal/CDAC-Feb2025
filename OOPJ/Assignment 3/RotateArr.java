import java.util.*;
 
class RotateArr{
	public static void rotateRight(int []arr,int k){
		int n = arr.length;
		k = k % n;

		reverseArr(arr,0,n-1);
		reverseArr(arr,0,k-1);
		reverseArr(arr,k,n-1);


	}



	public static void reverseArr(int []arr, int start , int end){

		while(start < end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}

	}	
	


	public static void main(String args[]){
		int []arr = {3,4,6,8,1,9};
		int k = 2;

		rotateRight(arr,k);
		System.out.println(Arrays.toString(arr));

		

	}

}
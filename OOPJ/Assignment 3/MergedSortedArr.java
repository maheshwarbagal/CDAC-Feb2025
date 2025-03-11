
import java.util.*;
class MergedSortedArr{

	public static void main(String args[]){
		int arr1[] = {1,4,6,7,9,10};
		int arr2[] = {2,4,6,8,11,13};

		int n = arr1.length;
		int m = arr2.length;
		int newArr[] = new int[n+m];
		int i=0,j=0,k=0;

	
		while(i < n && j < m){
			if(arr1[i] < arr2[j]){
				newArr[k++] = arr1[i++];
			}else{
				newArr[k++] = arr2[j++];
				
			}
		}

		while(i < n){
			newArr[k++] = arr1[i++];
		}
		while(j < m){
			newArr[k++] = arr2[j++];
		}
		
		System.out.println(Arrays.toString(newArr));
	}

}
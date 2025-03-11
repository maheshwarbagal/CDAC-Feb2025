import java.util.*;
class UnionIntersection{

	public static void main(String []args){
		int arr[] = {1,3,9,5,6,7};
		int n = arr.length;
		int arr2[] = {2,4,3,5,6};
		int m = arr2.length;
		int k=0;
		int result[] = new int [n+m];

		for(int I = 0; I < n ; I++){
			result[k++] = arr[I];
			
		}

		for(int I = 0; I < m; I++){
			boolean isPresent = false;
			
			for(int j = 0 ; j < k; j++){
				if(arr2[I] == result[j]){
					isPresent = true;
					break;
				}
			}
			if(!isPresent){
				result[k++] = arr2[I];
			
			}
		}
		int[] finalResult = Arrays.copyOf(result, k);
		System.out.print("Union of array : ");
		System.out.println(Arrays.toString(finalResult));
		
		int []Intersect = new int[n+m];
		int p=0;
		for(int I = 0 ; I < n; I++){
			for(int j = 0 ; j < m; j++){
				if(arr[I] == arr2[j]){
					Intersect[p++] = arr[I++];
				}
			}
		}
		int []finalInter = Arrays.copyOf(Intersect,p);
		System.out.print("Intersection of arrays : ");
		System.out.println(Arrays.toString(finalInter));
		
	}

}
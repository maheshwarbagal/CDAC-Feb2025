import java.util.*;
class SumSubArr{

	public static void main(String []args){
			int []arr = {5,3,6,8,9,10,6};
			int sum = 30;
			int mysum=0;
			int k = 0;
			int []myArr = new int[10];

			for(int I = 0; I < arr.length; I++){
				if(sum >= mysum){
					mysum += arr[I];
					myArr[k++] = arr[I];
				}
				
			}
			int finalArr[] = Arrays.copyOf(myArr,k);
			System.out.println(Arrays.toString(finalArr));
	
	}
	
}
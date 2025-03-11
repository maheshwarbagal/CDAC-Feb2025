import java.util.Arrays;
class Arrys{

	public static void main(String args[]){
		int []arr = {2,5,4,9,7};

		int []newArr = new int[arr.length-1];

		for(int I = 0 , j = 0 ; I < arr.length ; I++){

			if(I != 3){
				newArr[j++]=arr[I];
			}
		}
		System.out.println(Arrays.toString(newArr));
	
	}

}
class ReverseArr{

	public static void main(String args[]){
		int arr[] = {1,5,4,2,7,8};
		int size = arr.length;

		int newArr[] = new int[size];

		for(int I = arr.length-1 ,j=0; I >= 0; I--,j++){
			newArr[j] = arr[I];
		
		}

		for(int I : newArr){
			System.out.print(I+" ");
		}

	}

}
class RemDup{

	public static void main(String []args){

		int []arr = {2, 2, 5, 5, 6, 8, 11, 13, 18};
		int j=0;

		for(int I = 0 ; I < arr.length-1; I++){

			if(arr[I] != arr[I+1]){
				arr[j++] = arr[I];
			
			}
		}
		arr[j++] = arr[arr.length-1];

		for(int I=0; I < j ; I++){

			System.out.println(arr[I]);
		}
			


	}

}
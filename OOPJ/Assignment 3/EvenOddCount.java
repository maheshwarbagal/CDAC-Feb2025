class EvenOddCount{

	public static void main(String []args){
		int []arr = {3,6,7,9,0,1,2};
		int evenCount = 0;
		int oddCount = 0;

		for(int I = 0 ; I < arr.length; I++ ){
			if(arr[I] % 2 == 0){
				evenCount++;
				
			}else{

				oddCount++;
			}

		}
		System.out.println("Even Count : "+evenCount);
		System.out.println("Odd Count : "+oddCount);
	}

}
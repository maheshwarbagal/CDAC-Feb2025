class SmallLarge{

	public static void main(String []args){
		int []arr = {4,2,5,7,8,6,0};
		int smallNum = arr[0];
		int largeNum = arr[0];

		for(int I=1 ; I < arr.length ; I++){
			if(arr[I] < smallNum){
				smallNum = arr[I];
			}
			if(arr[I] > largeNum){

				largeNum = arr[I];
			}
		
		}


		System.out.println("Smallest Number : "+smallNum);
		System.out.println("Largest Number : "+largeNum);
		
			
	}

}
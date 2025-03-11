class SumAvg{

	public static void main(String []args){
		int arr[] = {1,4,3,2,6,7,8,4,5};
		int sum = 0;
		int count = 0;


		for(int I = 0; I < arr.length; I++){
			sum += arr[I];
			count++;
		}
		
		int Avg = sum/count;

		System.out.println(Avg);
	}

}
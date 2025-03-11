class MissingNum{

	public static void main(String []args){
		int arr[] = {1,3,4,5,6,7,8,9};
		int n = arr.length;

		int sumNatNum = (n * (n+1))/2;
		int actualSum = 0;

		for(int I=0 ; I<arr.length-1; I++){
			actualSum += arr[I];			
		} 

		int num = sumNatNum - actualSum;

		System.out.println(num);

	}

}
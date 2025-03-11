class SecondLargest{

	public static void main(String []args){

		int []arr = {4,2,6,8,9,3};
		int size = arr.length;
		int newArr[] = new int[size];

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for(int num : arr){
			if(num > first){
				second=first;
				first=num;	
			}else if(num > second && num != first){
				second=num;
	
			}
		}
		System.out.println("Second largest Element : "+second);
	}

}
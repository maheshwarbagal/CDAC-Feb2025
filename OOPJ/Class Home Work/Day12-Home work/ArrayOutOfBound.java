class ArrayOutOfBound{

	public static void main(String args[]){
		int arr[] = {1,2,3,4,5};

		try{
			int res = arr[6];
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Index out of bound");
		
		}
		
	}

}
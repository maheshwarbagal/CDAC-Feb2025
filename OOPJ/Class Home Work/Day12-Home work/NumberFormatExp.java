class NumberFormatExp{

	public static void main(String args[]){
		String s = "a";


		try{
			int a = Integer.parseInt(s);
		}catch(NumberFormatException e){
			System.out.println("Number format Exception");
		}


	}

}
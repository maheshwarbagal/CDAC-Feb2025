class TwoTrue{
	public static void main(String args[]){

		boolean a = true;
		boolean b = false;
		boolean c = false;

		if( (a && b ) || (a && c ) || (b && c) ){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}

}
class PosNegTer{

	public static void main(String args[]){

		int num = -4;

		String res = (num >= 0) ? (num+" is Positive") : (num <= 0) ? (num+" is Negative") : (num +" is Zero");

		System.out.println(res);
	}

}
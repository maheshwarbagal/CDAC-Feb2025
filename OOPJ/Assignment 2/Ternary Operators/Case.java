class Case{

	public static void main(String args[]){

		char ch = 'a';

		String res = (ch >= 'A' && ch <= 'Z') ? "Upper Case"
				:(ch >= 'a' && ch <= 'z') ? "Lower Case"	
				:"Not a Letter";

		System.out.println(res);
	}

}
class Ascii{

	public static void main(String [] args){

		char ch = 'A';
		int res = ch;
		System.out.println(res); 

		String str = "Hello world";

		for(char c : str.toCharArray()){
			System.out.println("String character "+c + " has value :  "+(int) c );
		}
		System.out.println();
	}
}
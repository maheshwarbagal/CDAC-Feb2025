
 
class ExceptionDemo{
	public static void main(String []args){
		String a = "20";
		String b = "a";

		

		try{
			int m = Integer.parseInt(a);
			int n = Integer.parseInt(b);
	
			int res = m/n;
			System.out.println(res);
		}catch(ArithmeticException e){
			System.out.println("Could not divide number by 0");
		}catch(NullPointerException e){
			System.out.println("Null point exception Occur");
		}catch(IndexOutOfBoundsException e){
			System.out.println("Index out of bound Exception");
		}catch(NumberFormatException e){
			System.out.println("Index out of bound Exception");
		}
	
	}

}
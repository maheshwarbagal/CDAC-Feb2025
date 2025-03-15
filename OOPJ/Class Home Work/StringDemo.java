class Animal{
	void display(){
		System.out.println("This is Animal class");
	}

}
 

class StringDemo{
	public static void main(String args[]){

		Animal an = new Animal();
		System.out.println(an instanceof Animal);
		System.out.println(an.getClass());

		/*
		StringBuilder sb = new StringBuilder("XAB");
		System.out.println(sb);
		sb.append("ABC");		
		System.out.println(sb);
		*/

		/*
		StringBuffer sb = new StringBuffer("ABC");
		sb.append("xyz");
		System.out.println(sb);
		*/
	}

}
class NullPointer{
	public static void main(String args[]){
		String s = null;
		
		try{
			s.length();
		}catch(NullPointerException e){
			System.out.println("String is pointing to null");
		}
		
	}


}
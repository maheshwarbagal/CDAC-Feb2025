class BitEven{
	public static void main(String [] args){
		int num = 4;

		if((num & 1) == 0){
			System.out.println("The Number is Even");
		}else{
			System.out.println("The number is Odd");
		}
	}

}
//		7	6		5
//.        0 1 1 1     0 1 1 0.     0 1 0 1
 //        0 0 0 1     0 0 0 1      0 0 0 1
      //.  --------------------------------
      //.  0 0 0 1     0 0 0 0      0 0 0 1  LSB = 0 EVEN , 1 = ODD.
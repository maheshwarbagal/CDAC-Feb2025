class SwapEvenOddBit{

	public static void main(String args[]){

		int num = 23;

		int evenBits = (num & 0xAAAAAAAA)>>1;
		int oddBits = (num & 0x55555555)<<1;

		int res = evenBits | oddBits;

		System.out.println(Integer.toBinaryString(num));
		System.out.println(res);
	}

}
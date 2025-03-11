import java.util.*;

class MaxIntPrd{

	public static void main(String []args){
		int []nums = { 2, 3, 5, 7, -7, 5, 8, -5 };

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for(int num : nums){
			if(num > first){
				second = first;
				first = num;

			}else if(num > second && num !=first){
				second = num;
			}

		}
		
		System.out.println("Pair is"+"("+second+","+first+")"+ " Maximum Product: "+(first * second));

	}

}
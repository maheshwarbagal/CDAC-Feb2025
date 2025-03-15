/*
class ReverseRecursion{
	public static String reverseRecursion(String str){
		if(str.isEmpty()){
			return str;
		}
		return reverseRecursion(str.substring(1)) + str.charAt(0);
	}
	

	public static void main(String args[]){
		String str = "Maheshwar";
		System.out.println(reverseRecursion(str));
		
	}

}*/


/*
import java.util.stream.Collectors;
import java.util.stream.IntStream;
class ReverseCollector{
	public static void main(String args[]){
		String str = "Maheshwar";
		String reversed = IntStream.range(0,str.length())
			.mapToObj(i -> str.charAt(str.length()-1-i))
			.map(String::valueOf)
			.collect(Collectors.joining());

		System.out.println(reversed);
	}

}
*/
 

/*
class CharArr{
	public static void main(String args[]){
		String str = "Maheshwar";
		char []arr = str.toCharArray();

		int left = 0, right = str.length()-1;

		while(left < right){
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
			
		}
		
		System.out.println(new String(arr));
	}

}
*/


/*
class ReverseLoop{
	public static void main(String args[]){
		String str = "Welcome";
		String reversed = "";
		for(int I = str.length()-1; I >= 0; I--){
			 reversed += str.charAt(I);
			System.out.println(reversed);
		}
	}

}
*/

/*
class ReverseString{

	public static void main(String args[]){
		String str = "Hello";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse().toString();

		System.out.println(sb);

	}


}
*/
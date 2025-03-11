
import java.util.*;
class Input20{

	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[20];
		int []even = new int[11];
		int []odd = new int[11];
		int []three = new int[11];
		int k=0,l=0,m=0;

		for(int I = 0; I < 20; I++){
			System.out.println("Enter the Number : ");
			int n = sc.nextInt();
			arr[I] = n;
		}

		for(int I = 0; I < 20; I++){
			if(arr[I] % 2 == 0){
				even[k++] = arr[I];
			}
			if(arr[I] % 2 != 0){
				odd[l++] = arr[I];
			}
			if(arr[I] % 3 == 0){
				three[m++] = arr[I];
			}
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(even)); 		
		System.out.println(Arrays.toString(odd));
		System.out.println(Arrays.toString(three));
	}

}
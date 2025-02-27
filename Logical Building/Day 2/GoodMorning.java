

import java.util.*;

class GoodMorning{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the current time : ");
		int time = sc.nextInt();

		//int hour = LocalTime.now().getHour();

		if(time >= 5 && time <= 12){
			System.out.println("Good Morning");
		}
		
		/*
		if(hour >= 5 && hour < 12){
			System.out.println("Good Morning");
		}
		*/
	
	}

}
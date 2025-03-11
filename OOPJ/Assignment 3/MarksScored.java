import java.util.*;
class Students{
	int phy;
	int chem;
	int math;
	int sum = 0;
	double percent = 0 ;

	Students(int phy, int chem, int math){
		this.phy = phy;
		this.chem = chem;
		this.math = math;
	}
		
	public String toString(){
		return "Physics Marks : "+phy+"  " +
			"Chemistry Marks : "+chem+"  " +
			"Math Marks : "+math;
	}
	
	int calculate(){
		sum += phy + chem + math;
		percent = (sum/300.0)*100;
		return sum;
	}
	
	void displayPer(){
		System.out.printf("Percentage scored : %.2f\n ",percent);
	}
	


}

class MarksScored{

	public static void main(String []args){
		Students[] student = new Students[20];
		Scanner sc = new Scanner(System.in);

		int seventy = 0;
		int fourty=0;

		
		for(int I = 0 ; I < 20; I++){
			System.out.println("Enter the marks of Physics : ");
			int phy = sc.nextInt();

			System.out.println("Enter the marks of Chemistry : ");
			int chem = sc.nextInt();

			System.out.println("Enter the marks of Math : ");
			int math = sc.nextInt();

			student[I] = new Students(phy,chem,math);
			
			
		}
		for(int I = 0 ; I < 20; I++){
			System.out.println("Student no: "+I);
			System.out.println(student[I]);
			System.out.println();
		}
		for(int I = 0 ; I < 20; I++){
			
			student[I].calculate();
			student[I].displayPer();

			if(student[I].percent <= 40){
				fourty++;
			}
			if(student[I].percent >= 75){
				seventy++;
			}
		}
		System.out.println("Number of Students above 75% : "+seventy);
		System.out.println("Number of Students below 40% : "+fourty);

	}

}
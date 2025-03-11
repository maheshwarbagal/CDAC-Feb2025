import java.util.Scanner;

class Employee{
	
	int id;
	String name;
	String Address;
	int ph;


	Employee(int id,String name,String Address ,int ph){
		this.id = id;
		this.name = name;
		this.Address = Address;
		this.ph = ph;

	}

	public String toString(){
		return "Employee ID: " + id + ", Name: " + name + 
               ", Address: " + Address + ", Phone: " + ph;
	}

	

}

class EmployeeMain{

	public static void main(String []args){

		
		Scanner sc = new Scanner(System.in);
		Employee[] e1 = new Employee[15];
		int count = 0;

		for(int I = 0 ; I < e1.length ; I++){

			System.out.println("Enter the Employee Details "+ (I+1)+": ");

			System.out.println("Enter the Employee id : ");
			int id = sc.nextInt();

			System.out.println("Enter the Employee name : ");
			String name = sc.next();

			System.out.println("Enter the Employee Address : ");
			String add = sc.next();

			System.out.println("Enter the Employee phone no : ");
			int ph = sc.nextInt();

			e1[I] = new Employee(id, name, add,ph);
			
			System.out.println("Do you want to enter more : (Y/N)");
			char ch = sc.next().charAt(0);
 			if(ch == 'N' || ch == 'n'){
				System.out.println("Your Data is Submitted");
				break;
			}
			count++;
		}

		for(int I = 0 ; I <= count ; I++){
			System.out.println(e1[I]);
		}
		
	}
}
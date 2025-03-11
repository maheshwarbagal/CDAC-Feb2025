import java.util.Scanner;

class Customer{

	int id;
	String CustomerName;
	String CustomerAddress;
	int phoneNo;

	
	Customer(int id,String name,String add, int ph){
		this.id = id;
		this.CustomerName = name;
		this.CustomerAddress = add;
		this.phoneNo = ph;
	}
	
	public String toString(){
		return "Customer ID : "+id+"  "+"Customer Name : "+CustomerName +" "+
			"Customer Address : "+CustomerAddress +" "+ "Customer Phone no." + phoneNo;
	}

	



}


class CustomerDemo{
	
	public static void main(String args[]){
		Customer[] c1 = new Customer[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int size = c1.length;

		System.out.println("Add new customer (ANC): ");
		System.out.println("Print Customer (PRT): ");
		System.out.println("Delete a customer (DAC): ");
		System.out.println("Exit (exit): ");
				
		System.out.println();
		System.out.println("Enter your choice : ");
		String res = sc.next();

		switch(res){
			case "ANC": 
				System.out.println("Enter the Details of Customer : ");
				for(int I = count+1 ; I < c1.length ; I++){
					count++;
					System.out.println("Enter the Customer id : ");
					int id = sc.nextInt();
					
					System.out.println("Enter the Customer name : ");
					String name = sc.next();

					System.out.println("Enter the Customer Address : ");
					String add = sc.next();

					System.out.println("Enter the Customer phone no : ");
					int ph = sc.nextInt();

					c1[I] = new Customer(id, name, add, ph);
					System.out.println("Customer Added Successfully");
					System.out.println();
				
					System.out.println("Want to Add more Customer : (Y/N)");
					char ch = sc.next().charAt(0);

					if(ch == 'N' || ch == 'n' ){
						System.out.println("Customer data Submitted");
						break;
					}
				}
				break;
				

			case "PRT":
				for(int I = 0 ; I < c1.length ; I++){
					System.out.println(c1[I]);
				}
				break;

			case "DAC":
				System.out.println("Enter the Customer Id from (0 to "+(size-1)+"to Delete Customer : ");

				int delId = sc.nextInt();

				for(int I = delId; I < size-1; I++){
					c1[I] = c1[I+1];
					
				}
				System.out.println("Customer Deleted SuccessFully");
				size--;
				
				break;

			case "exit":
				System.out.println("You have Exited");
				break;

			default:
				System.out.println("Invalid Typed");
		}

	
	}


}
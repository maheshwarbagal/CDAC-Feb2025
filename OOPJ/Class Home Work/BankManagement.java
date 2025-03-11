class Bank{

	int balance=0;

	Bank(int num){
		this.balance += num;
	}
	
	int withdraw(int num){
		balance -= num;
		return balance;
	}

	void deposit(int num){
		balance += num;
		System.out.println("Amount Added Successfully through Bank");
	}

}

class Customer{
	int id;
	String name;
	int age;
	int ph;
      String bankName;
	Bank bank;

	Customer(Bank b){
		this.bank = b; //Storing the reference of obj

	}
	Customer(){
		this.bankName = "Hasti Bank"; // default constructor
	}
	Customer(String name, int id ){
		this();		//Calling Default Constructor
		this.name = name;
		this.id = id;
		
	}

	void balanceCheck(){
		System.out.println("Your balance is : "+bank.balance);//using the instance variable of class
	}

	int withdraw(int num){
		bank.balance -= num;
		System.out.println("Your withdrawal is Successful");
		return bank.balance;
	}
	void deposit(int num){
		bank.deposit(num);
		//System.out.println("Amount Added Successfully By Customer"); 
	}
	public String toString(){
		return "Bank name : "+bankName+"Name : "+name+ " id : "+id;	
	}
	

}
 
class BankAppDemo{

	public static void main(String args[]){
	
		Bank B1 = new Bank(100);
		Customer C1 = new Customer(B1);//passing the Bank Reference in Customer class
		Customer C2 = new Customer("Mahesh",1);
		
		System.out.println();
		B1.deposit(100);
		C1.balanceCheck();
		System.out.println("Your Remaining balance is : "+C1.withdraw(50));
		C1.deposit(200);
		C1.balanceCheck();
		System.out.println(C2);
		System.out.println();
		
		
	}

}
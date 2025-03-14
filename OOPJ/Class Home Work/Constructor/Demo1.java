class Parent{
	 void display(){
		System.out.println("Method of parent class");
	}

	Parent(){
		System.out.println("Parent Constructor");
	}
}

class Child extends Parent{
	 void display(){
		System.out.println("Method of Child class");
	}

	Child(){
		System.out.println("Child Constructor");
	}
}

class Demo1{

	public static void main(String args[]){
		Child c = new Child();
		
	}


}
//Ans: -

//parent constructor 
//Child Constructor
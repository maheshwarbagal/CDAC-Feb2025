class Parent{
	
	Parent(){
		System.out.println("Parent Constructor ");
	}
	Parent(String name){
		System.out.println("Parent Constructor "+name);
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Child Constructor");
	}
	
		
}

class Demo5{
	public static void main(String args[]){
		Child c = new Child();
	}

}

//Parent Constructor 
//Child Constructor

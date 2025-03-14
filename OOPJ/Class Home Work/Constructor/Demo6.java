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
	Child(String name){
		System.out.println("Child Constructor "+name);
	}
	
		
}

class Demo6{
	public static void main(String args[]){
		Child c = new Child();
	}

}

//Parent Constructor 
//Child Constructor

class Parent{
	
	Parent(String name){
		System.out.println("Parent Constructor "+name);
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Child Constructor");
	}	
}

class Demo3{
	public static void main(String args[]){
		Child c = new Child();
	}

}

//constructor Parent in class Parent cannot be applied to given types

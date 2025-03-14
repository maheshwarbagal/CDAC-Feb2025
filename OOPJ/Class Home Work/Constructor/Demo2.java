class Parent{
	Parent(){
		System.out.println("Parent Constructor");
	}
}

class Child extends Parent{
	Child(String name){
		System.out.println("Child Constructor "+name);
	}	
}

class Demo2{
	public static void main(String args[]){
		Child c = new Child("Maheshwar");
	}

}

//parent constructor
//child constructor with parameter

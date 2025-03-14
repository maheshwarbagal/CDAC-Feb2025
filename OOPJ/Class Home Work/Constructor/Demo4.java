class Parent{
	
	Parent(){
		System.out.println("Parent Constructor ");
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

class Demo4{
	public static void main(String args[]){
		Child c = new Child("Mahesh");
	}

}

//Parent Constructor 
//Child Constructor Mahesh

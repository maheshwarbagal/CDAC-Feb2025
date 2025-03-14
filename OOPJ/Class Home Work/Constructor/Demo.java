class Parent{

	Parent(){
		System.out.println("Parameterize Parent Constructor");
	}

}

class Child extends Parent{
	Child(){
		System.out.println("Default child Constructor");
	}

	Child(String name){
		super();//constructor chaining
		System.out.println("Parameterize child Constructor"+name);
	}

}

class Demo{

	public static void main(String []args){
		Child c = new Child("Maheshwar");
	}

}

//Parameterize Parent Constructor
//Parameterize child ConstructorMaheshwar
class Flower{
	String name;
	String color;

	Flower(String name, String color){
		this.name = name;
		this.color = color;
	}
	
	void hasFragnanace(){
		if(name == "Rose" || name == "rose"){
			System.out.println(name +" has a fragnanace");
		}else{
			System.out.println(name+" does not have fragnance");
		}
	}
	
	void display(){
		System.out.println("Flower name : "+name);
		System.out.println("Flower Color : "+color);
	}

	

}
class Rose extends Flower{

	Rose(String name, String color){
		super(name,color);
		super.name = name;
		super.color = color;
	}	

	void hasThrons(){
		if(name == "Rose" || name == "rose"){
			System.out.println(name+" has thrones");
		}else{
			System.out.println(name+" does not have thrones");
		}
	} 
}

 class Lily extends Flower{

	Lily(String name, String color){
		super(name,color);
		super.name = name;
		super.color = color;
	}

	void isWaterPlant(){
		if(name == "Lily" || name == "lily"){
			System.out.println(name+" is Water plant");
		}else{
			System.out.println(name+" is not a water plant");
		}
	}

}


class Demo{
	public static void main(String args[]){
		Lily l1 = new Lily("Lily","Brown");
		l1.display();
		l1.hasFragnanace();
		l1.isWaterPlant();
		System.out.println();
		
		Rose r1 = new Rose("rose","red");
		r1.display();
		r1.hasFragnanace();
		r1.hasThrons();
	}

}
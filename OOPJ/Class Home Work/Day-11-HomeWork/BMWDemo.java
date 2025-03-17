class BMW{
	void showDetails(){
		System.out.println("This is a BMW vehicle.");
	}

	void maxSpeed(){
		System.out.println("Speed varies by model.");
	}

}

class BMWSeries3 extends BMW{
	void showDetails(){
		System.out.println("This is a BMWSeries3.");
	}

	void maxSpeed(){
		System.out.println("Speed is 240 km/hr.");
	}
}

class BMWSeries5 extends BMW{
	void showDetails(){
		System.out.println("This is a BMWSeries5.");
	}

	void maxSpeed(){
		System.out.println("Speed is 260 km/hr.");
	}
}

class BMWSeries7 extends BMW{
	void showDetails(){
		System.out.println("This is a BMWSeries7.");
	}

	void maxSpeed(){
		System.out.println("Speed is 300 km/hr.");
	}
}

class BMWDemo{
	public static void main(String []args){
		BMW[] cars= {new BMWSeries3() ,new BMWSeries5() ,new BMWSeries7()};
		for(BMW car: cars){
			car.showDetails();
			car.maxSpeed();
		}
		
	}

}


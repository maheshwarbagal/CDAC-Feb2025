interface Photosynthesis{
	void absorbSunlight();
}

interface Respiration{
	void releaseOxygen();
}

class Plant implements Photosynthesis,Respiration{
	private String plantName;

	Plant(String name){
		this.plantName = name;
	}

	String getPlantName(){
		return plantName;
	}
	
	public void absorbSunlight(){
		System.out.println("Plant is absorbing sunlight for photosynthesis.");
	}

	public void releaseOxygen(){
		System.out.println("Plant is releasing oxygen through respiration.");
	}
}

class PlantDemo{
	public static void main(String args[]){
		Plant p1 = new Plant("Mango");
		System.out.println(p1.getPlantName());
		p1.absorbSunlight();
		p1.releaseOxygen();

		Plant p2 = new Plant("Fern");
		System.out.println(p2.getPlantName());
		p2.absorbSunlight();
		p2.releaseOxygen();
	}
}
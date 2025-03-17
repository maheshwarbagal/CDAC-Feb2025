abstract class Shape{
	protected String shapeName;
	abstract float calculateArea();

	Shape(String shape){
		this.shapeName = shape;
	}
	
	String getShapeName(){
		return shapeName;
	}
}

class Circle extends Shape{
	private float radius;
	
	Circle(float rad){
		super("Circle");
		this.radius = rad;
	}

	float calculateArea(){
		float Area = (float) (Math.PI * (radius * radius));
		return Area;
	}
}

class Rectangle extends Shape{
	private float length;
	private float breadth;
	

	Rectangle(float length, float breadth){
		super("Rectangle"); 
		this.length = length;
		this.breadth = breadth;
	}

	float calculateArea(){
		float Area = (float)(length * breadth);
		return Area;
	}

}

class ShapeDemo{

	public static void main(String args[]){
		Circle c1 = new Circle(0.5f);
		System.out.println(c1.calculateArea());

		Rectangle r1 = new Rectangle(4.0f,6.0f);
		System.out.println(r1.calculateArea());

		Shape s1 = new Circle(1.0f);
		System.out.println(s1.calculateArea());
		System.out.println(s1.getShapeName());

		Shape s2 = new Rectangle(2.0f,3.4f);
		System.out.println(s2.calculateArea());
	}

}









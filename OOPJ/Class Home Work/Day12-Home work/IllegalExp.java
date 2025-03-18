
class Employee{
	int age;
		
	void setAge(int age){
		if(age < 0 || age > 150){
			throw new IllegalArgumentException("Age should be from 0 to 150");
		}else{
			this.age = age;
		}
	}


}
 

class IllegalExp{

	public static void main(String args[]){

		Employee e = new Employee();
		e.setAge(-10);
		System.out.println(e.age);
		
		
	}

}
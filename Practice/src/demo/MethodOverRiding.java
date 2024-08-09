package demo;

class Vehicles
{
	void move()
	{
		System.out.println("the vehilc moves");
	}
}

class Car extends Vehicles
{
	void move()
	{
		System.out.println("the car drivers");
	}
}
class Bicycle extends Vehicles
{
	void move()
	{
		System.out.println("the bicycle pedals");
	}
}
class Airplane extends Vehicles
{
	void move()
	{
		System.out.println("the airplane flies");
	}
}
public class MethodOverRiding {

	public static void main(String[] args) {
		Vehicles obj=new Vehicles();
		obj= new Car();
		obj.move();
		obj=new Bicycle ();
		obj.move();
		obj=new Airplane();
		obj.move();

	}

}

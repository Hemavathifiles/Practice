package demo;



interface Vehicle1
{
	void start();
	void stop();

	int Max_speed=120;
	
	default void repair()
	{
		System.out.println("vehicle is being repaired ");
	}
	
	static void checkMaintaince()
	{
		System.out.println("vehicle Maintaince check complete ");
	}
}

class Car6 implements Vehicle1 
{
    private String model;
    
    
    
	public Car6(String model) {
		this.model = model;
	}

	@Override
	public void start() {
		
		System.out.println("car" + model +" is staring ");
	}

	@Override
	public void stop() {
		
		System.out.println("car" + model +" is stoping ");
	}
	
}

class Bike6 implements Vehicle1
{
    private String type;
    
    
    
	public Bike6(String type) {
		this.type = type;
	}

	@Override
	public void start() {
		
		System.out.println("car" +type+" is staring ");
	}

	@Override
	public void stop() {
		
		System.out.println("car" + type+" is stoping ");
	}
	
}


public class Default_static_method_interface {

	public static void main(String[] args) {
		Vehicle1 car=new Car6("KIA");
		Vehicle1 bike=new Bike6("Royal Enfield"); 
		
		car.start();
		car.stop();
		
		bike.start();
		bike.stop();
		
		System.out.println("maximun speed of vehicles" +"     " +  Vehicle1.Max_speed );
		
		car.repair();
		bike.repair();
		
		Vehicle1.checkMaintaince();
		
	}

}



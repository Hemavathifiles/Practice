package demo;


class Human{
	private int age;
	private String Name;
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int a)
	{
		age=a;
	}
	public String getName() 
	{
		return Name;
	}
	public void setName(String n)
	{
		Name=n;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Human obj=new Human();
		Human obj1=new Human();
		obj.setAge(30);
		obj.setName("neha");
		System.out.println(obj.getName() +":" +obj.getAge());
		
		obj1.setAge(40);
		obj1.setName("sushma");
		System.out.println(obj1.getName() +":" +obj1.getAge());

	}

}

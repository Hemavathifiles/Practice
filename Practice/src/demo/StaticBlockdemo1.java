package demo;

public class StaticBlockdemo1 {

	public void display()
	{
		System.out.println("instance block-1");
	}
	
	static 
	{
		System.out.println("static block-1");
		
	}
	static
	{
		System.out.println("static block-2");
	}
	public static void main(String[] args) {
		StaticBlockdemo1 obj=new StaticBlockdemo1();
		obj.display();
		
	}

}

package demo;

class MyClass1{
	String color;
	int cost;
	String Brand;


MyClass1()
{
	//System.out.println("In constrcutor");
	color="Pink";
	cost=2000000;
	Brand="BMW";
}
}
public class DefaultConstructor {

	public static void main(String[] args) {
		MyClass1 obj=new MyClass1();
		System.out.println(obj.color+ "  "+ obj.cost + "  "+obj.Brand);

	}

}

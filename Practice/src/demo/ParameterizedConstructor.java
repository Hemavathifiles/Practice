package demo;

class MyClass2{
	String color;
	int cost;
	String Brand;


MyClass2(String color,int cost,String Brand)
{
	this.color=color;
	this.cost=cost;
	this.Brand=Brand;
}

}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		MyClass2 obj=new MyClass2("white",2000,"BMW");
		System.out.println(obj.color+ "  "+ obj.cost + "  "+obj.Brand);

	}

}

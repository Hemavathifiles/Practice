package demo;

class MathOp
{
	public int add(int a, int b)
	{
	return a+b;
	}
	public int add(int a, int b,int c)
	{
	return a+b+c;
	}
	public double add(int a, double b)
	{
	return a+b;
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		 MathOp obj=new  MathOp();
		   System.out.println(obj.add(4, 8));
		   System.out.println(obj.add(4, 8,5));
		   System.out.println(obj.add(4, 8.5));
	}

}

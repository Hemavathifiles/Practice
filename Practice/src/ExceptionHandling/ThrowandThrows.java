package ExceptionHandling;

public class ThrowandThrows {
	void validate(int age)
	{
		if (age<18)
		{
			throw new ArithmeticException("they are not eligible for C@TC");
		}
		else
		{
			System.out.println("they are eligible");
		}
	}
	public static void main(String[] args)
	{
		ThrowandThrows obj=new ThrowandThrows();
		obj.validate(2);
		System.out.println("wlecome C2TC");
	
	}
}

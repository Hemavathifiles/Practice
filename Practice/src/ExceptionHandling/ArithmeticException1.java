package ExceptionHandling;

public class ArithmeticException1 {

	public static void main(String[] args) {
		
		
		int number_one=50/5;
		System.out.println(number_one);
		int number_two=50/10;
		System.out.println(number_two);
		try {
			int number_three=50/12;
			System.out.println(number_three);
		}
		catch(ArithmeticException e) 
		{
			System.out.println(e);
		}
		
		int number_four=50/25;
		System.out.println(number_four);
		
		
		

	}

}

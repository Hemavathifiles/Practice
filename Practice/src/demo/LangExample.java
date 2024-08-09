package demo;

public class LangExample {

	public static void main(String[] args) {
		String greeting="Hello world";
		System.out.println("original string"+greeting);
		System.out.println("uppercase"+ greeting.toUpperCase());
		System.out.println("substring"+greeting.substring(7));
		
		int max=Math.max(10,20);
		double sqrt=Math.sqrt(25.0);
		System.out.println("max"+max);
		System.out.println("sqrt"+sqrt);

	}

}

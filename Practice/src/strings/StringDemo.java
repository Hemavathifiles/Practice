package strings;

public class StringDemo {

	public static void main(String[] args) {
		String s1="Hello World";
		String s2="Hello World";
		String s3="Greetings";
		String s4=new String("Greetings");
		String s5="Hello World";
		if (s1==s2) // in order to compare reference or address
		{
			System.out.println("Reference pointing to the same object");
		}
		else
		{
			System.out.println("Reference pointing to the seperate object");
		}
		

	}

}

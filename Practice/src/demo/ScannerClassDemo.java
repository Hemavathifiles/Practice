package demo;
import java.util.Scanner;
public class ScannerClassDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your name");
		String name=scanner.nextLine();
		System.out.println("enter your age");
		int age=scanner.nextInt();
		System.out.println("name :"+name+ "    "  + "age:" + age);
		scanner.close();
	}

}

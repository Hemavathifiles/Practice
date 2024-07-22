package demo;

public class TernaryOperator {

	public static void main(String[] args) {
		int age=17;
		String eligibility= (age>=18)?"eligible": " Not eligible";
		System.out.println("age-"+age);
		System.out.println("voting eligibility -"+eligibility);

	}

}

package demo;

public class NestedIfDemo {

	public static void main(String[] args) {
		double purchaseAmount = 0;
		boolean isMember = false;

		if (isMember) {
		    if (purchaseAmount > 100) {
		        System.out.println("Eligible for a 20% discount.");
		    } else {
		        System.out.println("Eligible for a 10% discount.");
		    }
		} else {
		    System.out.println("Not eligible for a discount.");
		}

	}

}

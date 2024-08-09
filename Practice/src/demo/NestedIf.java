package demo;

public class NestedIf {

	public static void main(String[] args) {
		boolean isAuthenticated = true;
		boolean hasAdminRights = false;

		if (isAuthenticated) {
		    if (hasAdminRights) {
		        System.out.println("Access granted to admin resources.");
		    } else {
		        System.out.println("Access granted to user resources.");
		    }
		} else {
		    System.out.println("Authentication required.");
		}


	}

}

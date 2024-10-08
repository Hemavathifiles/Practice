package MarkerInterface;

public class MarkerInterface {

	public static void main(String[] args) {
		Registrable s=new Student(101,"Neha",12000,"C++");
		Registrable s1=new Student(103,"hema",16000,"C");
		Object obj = new Object();//The class Object is a built-in class in Java that is part of the java.lang package,
		//which means it's automatically available in every Java program (you don't need to explicitly import it).
		if (obj instanceof Registrable )
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
			

	}

}

//interface -(VIP badge)
//class implementing the marker interface (person with VIP badge)
//instanceof check is like verifying if someone has the VIP badge
//s1 is marked with VIP  badge and should be treated accordingly
//The marker interface itself doesn't add functionality instead , its used as a signal for other
//part of the application to treat object of class diff based on the presence of this marker.
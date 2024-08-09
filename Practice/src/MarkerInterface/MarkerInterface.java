package MarkerInterface;

public class MarkerInterface {

	public static void main(String[] args) {
		Registrable s=new Student(101,"Neha",12000,"C++");
		Registrable s1=new Student(103,"hema",16000,"C");
		if (s1 instanceof Registrable )
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
			

	}

}
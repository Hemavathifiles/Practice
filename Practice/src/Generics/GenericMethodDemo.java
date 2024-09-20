package Generics;

public class GenericMethodDemo {

	static <T> void genericdisplay(T element) {
		System.out.println(element.getClass().getName()+ " = "+ element);
	}
	public static void main(String[] args) {
		genericdisplay(11);
		genericdisplay("TNS");
		genericdisplay(1.0);

	}

}

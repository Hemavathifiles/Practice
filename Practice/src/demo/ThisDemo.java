package demo;

class Person {
    // Private fields
    private String name;
    private int age;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    
    }
}
public class ThisDemo {

	public static void main(String[] args) {
		Person obj=new Person();
		obj.setName("Alice");
		obj.setAge(20);
		obj.setName("bobe");
		obj.setAge(40);
		obj.setName("JOEL");
		obj.setAge(40);
		obj.getName();
		obj.getAge();
		obj.displayDetails();
		
	}

}

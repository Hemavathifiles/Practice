package org.tnsif.corejava.annotation;

class MyClass {
    @Deprecated
    void oldMethod() {
        System.out.println("This method is deprecated");
    }

    void newMethod() {
        System.out.println("This method is the recommended one");
    }

}
public class DeprecateAnnotation
{
	
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.oldMethod();  // Output: This method is deprecated
        obj.newMethod();  // Output: This method is the recommended one
    }
}

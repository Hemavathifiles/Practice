package demo;

public class Variables {

		//types of variables 1.local variable,instance variable and static variable
			//instance variable
			int a=10;	
			//local variable
		    void print() {
		    	String msg="hello i am local variable";
		    	System.out.println(msg);
		    }
			//static variable
		    static String message="Hello i'm static variable";	
			public static void main(String[] args) {
				Variables ob=new Variables();	
				System.out.println("The value of a"+ob.a);	
				ob.print();	
				System.out.println(message);	
		       
			}
			
	}



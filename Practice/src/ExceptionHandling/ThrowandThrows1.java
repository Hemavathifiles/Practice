package ExceptionHandling;

import java.io.IOException;

public class ThrowandThrows1 {
	//hema
	void m1()
	{
		System.out.println("no exception in this method");
	}
	//abhishek
	void m2() throws IOException
	{
		throw new IOException("device error");
		//System.out.println("device error");
	}
	
	//bhavesh
	void m3() throws ArithmeticException , IOException, ClassNotFoundException
	{
		throw new  ArithmeticException("");
		throw new  IOException("");
		throw new  ClassNotFoundException("");
		
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

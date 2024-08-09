package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class IOExceptionDemo {

	public static void main(String[] args) throws IOException  {
		try {
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\hemav\\OneDrive\\Desktop\\JAVA IMP\\demo1.txt"));
		String data="";
		while((data=br.readLine())!=null)
		{
			System.out.println(data);
		}
		}catch (Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}


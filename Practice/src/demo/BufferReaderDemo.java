package demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException  {
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\hemav\\OneDrive\\Desktop\\JAVA IMP\\demo.txt"));
		String data="";
		while((data=br.readLine())!=null)
		{
			System.out.println(data);
		}
		
		
		
	}

}

package List;


import java.io.*;
import java.util.*;

class ArrayLists
{
	public static void main(String[] args)
	{
		ArrayList<Integer>ai = new ArrayList<Integer>();
		for (int i=1;i<=5;i++)
			ai.add(i);
		System.out.println(ai);
		ai.remove(3);
		System.out.println(ai);
		
		for (int i=0;i<ai.size();i++)
		{
			System.out.println(ai.get(i)+"");
		}

		
	}
}
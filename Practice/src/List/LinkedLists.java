package List;

import java.util.*;

class LinkedLists
{
	public static void main(String[] args)
	{
		LinkedList<Integer>ai = new LinkedList<Integer>();
		for (int i=1;i<=5;i++)
			ai.add(i);
		System.out.println(ai);
		ai.remove(3);
		System.out.println(ai);
		
		for (int i=0;i<ai.size();i++)
		{
			System.out.print(ai.get(i)+"  ");
		}

		
	}
}
package demo;

 class calc
{
	public final void show()
	{
		System.out.println("AI integration done by hema");
	}
	public void add(int a , int b)
	{
		System.out.println(a+b);
	}
}
class advcalc extends calc
{
	public void show()
	{
		System.out.println("AI integration done by akash");
	}
	public void add(int a,int b)
	{
		System.out.println("we are doing adding " );
	}
}
public class FinalKeywordDemo {

	public static void main(String[] args) {
		advcalc obj=new advcalc();
		obj.add(4,5);
	}

}

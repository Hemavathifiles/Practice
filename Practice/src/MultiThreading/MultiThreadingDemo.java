package MultiThreading;

class Eclipse extends Thread
{
	public void run()
	{
	System.out.println("Eclipse Id is "+ Thread.currentThread().getId());
}
}
class Chrome extends Thread
{
	public void run()
	{
	System.out.println("chrome Id is "+ Thread.currentThread().getId());
	}
}
class NoteBook extends Thread
{
	public void run()
	{

	System.out.println("Notebook Id is "+ Thread.currentThread().getId());
}
}

public class MultiThreadingDemo {

	public static void main(String[] args) {
		Eclipse obj=new Eclipse();
		obj.start();
		Chrome obj1=new Chrome();
		obj1.start();
		NoteBook obj2=new NoteBook();
		obj2.start();
		System.out.println();
		System.out.println("Main Id is "+ Thread.currentThread().getId());
		

	}

}

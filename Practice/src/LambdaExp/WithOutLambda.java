package LambdaExp;


interface Drawable
{
	public void draw();
}
class Test implements Drawable
{
	int width=10;
	public void draw()
	{
		System.out.println("Drawing"+ width);
	}

}
public class WithOutLambda {

	public static void main(String[] args) {
		Drawable d = new Test();
		d.draw();
		

	}

}

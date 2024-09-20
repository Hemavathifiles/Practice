package LambdaExp;

@FunctionalInterface

interface Drawable1
{
	public void draw();
	
}

public class WithLambdaExp {

	public static void main(String[] args) {
		int width=20;
		Drawable1 d2=()->{System.out.println("Drawing   "  + width);
		};
		d2.draw();
	}

}

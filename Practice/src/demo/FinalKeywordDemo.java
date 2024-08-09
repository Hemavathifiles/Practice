package demo;
 class Calc
 {
	 public final void show()
	 {
		 System.out.println("By Hema");
	 }
	 public void add(int a ,int b)
	 {
		 System.out.println(a+b);
	 }
 }
 class AdvCalc extends Calc
 {
	 public void show()
	 {
		 System.out.println("By john");
	 }
 }
 
 
public class FinalKeywordDemo {

	public static void main(String[] args) {
		AdvCalc obj=new AdvCalc();
		obj.show();
		obj.add(4, 5);

	}

}

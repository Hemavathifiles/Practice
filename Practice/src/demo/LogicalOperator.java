package demo;

public class LogicalOperator {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		boolean res;
		res=(a>5) && (b<10);
		System.out.println("(a>5) && (b<10)" + res);
		res=(a>=20) && (b<=2);
		System.out.println("(a>20) && (b<2)" + res);
		res=(a>5) || (b<=2);
		System.out.println("(a>5) || (b<=2)" + res);
		res =!(a==5);
		System.out.println("!(a==5)"+ res);
		
	}

}

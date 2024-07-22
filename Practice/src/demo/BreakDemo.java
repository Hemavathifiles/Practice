package demo;

public class BreakDemo {
	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) {
			if (i == 51)
			{
				break;
			}
			System.out.println(i);
		}

	}
}
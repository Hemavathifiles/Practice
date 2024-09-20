package demo;

public class KIA_Motors {

		int noCar;
		String model;
		String engine;
		int speed =100;
		
		void display()
		{
			System.out.println("This is KIA Motors, Welcome to our Show room");
		}
		void welcome()
		{
			System.out.println("WELCOME");
		}
		
		public static void main(String[] args) {
			
			KIA_Motors object=new KIA_Motors ();
			object.display ();
			object.welcome();
			object.noCar=1987;
			object.model="KIA";
			object.engine="Smartstream";
			System.out.println(object.noCar);
			System.out.println(object.model);
			System.out.println(object.engine);
			System.out.println(object.speed);
			}

}

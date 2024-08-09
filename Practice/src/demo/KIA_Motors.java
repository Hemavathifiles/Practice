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
			object.model="KIA";
			System.out.println(object.speed);
			System.out.println(object.model);
			}

}

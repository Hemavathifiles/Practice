package demo;



public class SwitchDemo 
{
	public static void main(String[] args) {

		char x = 'm';
		switch (x) 
		{
		case 'l' : 
		case 'L' : 
			System.out.println(x+" is a Letter");
			break;
		case 'd':
		case 'D' :
			System.out.println(x+" is a Digit");
			break;
		case 'w':
		case 'W' :	
			System.out.println(x+" is White Space");
			break;
		default:
			System.out.println(x+" is other than letter, digit and space  ");
			break;
		}
	
	}

}
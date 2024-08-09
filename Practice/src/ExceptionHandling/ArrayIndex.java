package ExceptionHandling;


public class ArrayIndex {

    public static void main(String[] args) {
        int[] arr = new int[4]; // 0,1,2,3 -index
        System.out.println("welcome");
        try {
            int i = arr[3]; // Accessing the last element, no exception here
            System.out.println();
        }
        catch(ArrayIndexOutOfBoundsException e) 
        {
        	System.out.println();
        }
        finally
        {
        	System.out.println("whatever happen this line gets exceuted");
        }
        System.out.println("good eve");
    }
}



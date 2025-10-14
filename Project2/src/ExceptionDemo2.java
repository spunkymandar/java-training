//Handling more than one exception in single try block
public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] arr=new int[5];
			arr[2]=10/2;
		}
		
		catch(ArrayIndexOutOfBoundsException ab) {
			System.out.println("Array index is not available!");
			
		}
		catch(ArithmeticException ae) {
			System.out.println("Cannot divide by zero");
		}
		catch(Exception e) {
			System.out.println("Exceptoin occured !!");
		}
		finally {
		
			System.out.println("Program successfully executed");
		}
	}

}

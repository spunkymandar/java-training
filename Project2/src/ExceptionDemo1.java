//using try-catch
public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		int ans;
		num1=10;
		num2=0;
		try {
			ans=num1/num2;
			System.out.println("Division ="+ans);
		}
		catch(ArithmeticException ae) { //argument contains actual instance of excp
			System.out.println("Cannot divide by zero!!");
		}
		
	}

}
 
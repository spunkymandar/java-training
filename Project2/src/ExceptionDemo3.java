//throwing the exception manually
public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(10);
	}

	private static void validate(int age) {
		// TODO Auto-generated method stub
		if(age<18)
			throw new ArithmeticException("Not eligible for vote");
		else
			System.out.println("You are eligible");
	}

}

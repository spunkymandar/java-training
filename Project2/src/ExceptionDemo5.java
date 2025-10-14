//user-defined exception usage
public class ExceptionDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validateAge(20);
		} catch (AgeInvalidException ae) {
			System.out.println(ae);
		}
	}

	private static void validateAge(int age) throws AgeInvalidException {
		// TODO Auto-generated method stub
		if (age < 18)
			throw new AgeInvalidException("Age must be above 18 years");
		else
			System.out.println("Welcome to the system ");
	}

}

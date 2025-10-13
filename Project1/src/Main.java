
public class Main {
	public static void main(String... args) {
		System.out.println("hello from java again  & again!");
//		int[] data= {10,20,40,4,54,23,54};
		
		Employee emp1=new Employee();
		emp1.initEmployeeData(101, "John", "Programming");
		emp1.calculateSalary();
		String empInfo=emp1.displayEmployee();
		System.out.println(empInfo);
		
		
	}
}

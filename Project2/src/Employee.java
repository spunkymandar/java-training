
public class Employee implements PrintInterface{
	private String firstName,lastName;
	public Employee(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e=(Employee)obj;
		if(this.firstName.equals(e.firstName)) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.firstName +" , "+this.lastName;
	}
	@Override
	public String printInformation() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/*
	 * SalesPerson extends Employee;
	 * 
	 * Salesperson sp1=new SalesPerson();
	 * Employee sp2=new SalesPerson()
	 * Object sp3=new SalesPerson()
	 * 
	 * 
	 */
	
	
	

}

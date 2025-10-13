//this
public class Employee {
	//attrribute
	private int empId;//getEmpId()
	private String empName,empDept;
	private double empSalary;
	
	//behaviours
	
	public void initEmployeeData(int empId,String empName, String empDept) {
		this.empId=empId;
		this.empName=empName;
		this.empDept=empDept;
	}
	
	public double calculateSalary() {
		this.empSalary=10000;
		return this.empSalary;
	}
	
	public String displayEmployee() {
		return this.empId+" "+this.empName +" "+this.empDept+" "+this.empSalary;
	}
	

}

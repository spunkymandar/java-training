//Method overloading 
public class Calculator {
	/*Observe method overloading in respect of: 
	 * 1. Data Upcasting: int->double
	 * 2. Boxing : int ->Integer
	 * 3. Up-boxing: Integer->Double
	 * 
	 * addNumbers(10,20)
	 *int,int :if removed
	 *double,double
	 *Integer,Integer
	 *Double, Double
	 *int... 
	 * 
	 *public double addNumbers(int x, int y) {
		return x+y;
	}
	 * 
	 * 
	 */
	
	
	public double addNumbers(int x, int y) {
		return x+y;
	}
	
	public double addNumbers(double x, double y) {
		return x+y;
	}
	
	public double addNumbers(int x, double y) {
		return x+y;
	}
	

}

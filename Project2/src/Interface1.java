
public interface Interface1 {
	public void service1();
	
	/*
	 * default methods in interfaces were introduced in Java8
	 * its adds more flexibility to update the existing interface so that
	 * the earlier dependant classes will not fail. 
	 */
	public default void service2() {
		
	}
}

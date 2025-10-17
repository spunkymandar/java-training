class A{
	synchronized void methodA(B b) {
		System.out.println("Thread1 starts methodA");
		try {
			Thread.sleep(100);
		}
		catch(Exception e) {
			
		}
		System.out.println("Thread1 trying to call B.last");
		b.last();
	}
	synchronized void last() {
		System.out.println("Inside A.last()");
	}
}
class B{
	synchronized void methodB(A a) {
		System.out.println("Thread2 starts methodB");
		try {
			Thread.sleep(100);
		}
		catch(Exception e) {
			
		}
		System.out.println("Thread2 trying to call a.last");
		a.last();
	}
	synchronized public void last() {
		// TODO Auto-generated method stub
		System.out.println("inside B.last()");
	}
	
}
public class DeadLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A();
		B b1=new B();
		new Thread(()->a1.methodA(b1)).start();
		new Thread(()->b1.methodB(a1)).start();
	}

}

class PrintTable{
	synchronized static void printIt(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+n*i);
			try {
				Thread.sleep(400);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class StaticSynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(()->PrintTable.printIt(5));
		Thread t2=new Thread(()->PrintTable.printIt(7));
		t1.start();
		t2.start();
	}

}

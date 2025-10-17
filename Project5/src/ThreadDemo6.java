class Worker extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(getName()+" executing step :"+i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		Worker t1=new Worker();
		Worker t2=new Worker();
		Worker t3=new Worker();
		t1.start();
		t1.join();//main invokis the join on t1, so main is paused till t1 is complete
		t2.start();
		t2.join(1000,100);
		
		
		t3.start();
		t3.join();
		
	
	}

}

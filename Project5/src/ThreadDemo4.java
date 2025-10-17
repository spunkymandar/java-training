class RunnableDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++) {
			System.out.println(Thread.currentThread().getName()+" -count: "+i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
	
}

public class ThreadDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableDemo r1=new RunnableDemo();
		
		Thread t1=new Thread(r1,"worker-1");
		//Thread t1=new Thread(Runnable ref, String threadname)
		Thread t2=new Thread(r1,"worker-2");
		
		//Thread t3=new Thread(()->{},"");
		Thread t3=new Thread(()->{
				
			for(int i=1;i<=5;i++) {
				System.out.println(Thread.currentThread().getName()+" -count: "+i);
				try {
					Thread.sleep(500);
				}
				catch(InterruptedException ie) {
					ie.printStackTrace();
				}
			}
		},"worker-3");
		
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}

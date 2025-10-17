class Counter{
	int count=0;
//	void increment() {
//		count++;
//	}
	

	//synchronized methods, makes sure that the method is utlized by one thread at a time
//	synchronized void increment() {
//		count++;
//	}

	void increment() {
		System.out.println(Thread.currentThread().getName() +"entered with value: "+count);
		synchronized(this) {
			count++;
		}
	}

}
public class RaceConditionDemo {
	public static void main(String[] args) throws InterruptedException {
		Counter counter=new Counter();
		Thread t1=new Thread(()->{
			for(int i=0;i<1000;i++)
				counter.increment();
		});
		
		Thread t2=new Thread(()->{
			for(int i=0;i<1000;i++) {
				counter.increment();
			}
		});
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final count ="+counter.count);
	}

}

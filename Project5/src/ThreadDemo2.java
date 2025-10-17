class PriorityThread extends Thread{
	public void run() {
		System.out.println(getName()+" with priority "+getPriority()+" is running");
		
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityThread thread1=new PriorityThread();
		PriorityThread thread2=new PriorityThread();
		PriorityThread thread3=new PriorityThread();
		
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(Thread.NORM_PRIORITY);
		thread3.setPriority(Thread.MAX_PRIORITY);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}

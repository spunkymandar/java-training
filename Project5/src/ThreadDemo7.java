class StatusThread extends Thread{
	public void run() {
		System.out.println(getName()+ " is running...");
	}
}

public class ThreadDemo7 {
	public static void main(String[] args) throws InterruptedException {
		StatusThread st1=new StatusThread();
		System.out.println("Before start :"+st1.isAlive());
		st1.start();
		System.out.println("AFter start:"+st1.isAlive());
		
		st1.join();
		System.out.println("After join:"+st1.isAlive());
	}

}

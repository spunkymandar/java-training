/*
 * Creating a thread
 * 		extends Thread class
 * 		implements Runnable 
 * 		implements Callable
 * 		lambda expresssion
 */
class ThreadDemo extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println(getName()+" -count: "+i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}
public class ThreadDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo td1=new ThreadDemo();
		ThreadDemo td2=new ThreadDemo();
		
		td1.start();
		td2.start();
		
		
	}

}

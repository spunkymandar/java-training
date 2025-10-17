/*Thread Lifecycle or Thread states:
 * 	New		: Thread is created but it is not started
 * 	Runnable: Ready to run or currently it is running
 *  Blocked	: Waiting for a lock to access a resource
 *  Waiting	: Waiting indefinitely for another thread's action
 *  Timeed_watiting: Waiting for a specific amount of time
 *  Termination : Thread has finished executing
 *
 *Methods of Threads: 
 *	start()	: starts a new thread and calls run() method
 *  run()	: contains the code that the thread executes
 *  sleep(ms):suspends the thread execution for specified miliseconds
 *  join()	: Waits for the thread to finish
 *  get/setPriority
 *  isAlive()
 *  currentThread():
 *  interrupt(): interrups the sleeping/waiting thread
 */

class MyThread extends Thread{
	public void run() {
		System.out.println(getName()+" is running");
		try {
			Thread.sleep(1000);//1 second
			
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println(getName()+" is terminted");
	}
}


public class ThreadDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread thread1=new MyThread();
		thread1.setName("Samplethread");
		System.out.println("State before start:"+thread1.getState());
		thread1.start();
		System.out.println("State after start:"+thread1.getState());
		
		Thread.sleep(100);//in thse 100 ms, another thread could take up by CPU
		System.out.println("State during sleep:"+thread1.getState());
		
		thread1.join();
		System.out.println("State after the join:"+thread1.getState());
	}

}

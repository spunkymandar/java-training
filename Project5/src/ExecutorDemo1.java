import java.util.concurrent.*;
public class ExecutorDemo1 {
	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(3);
		for(int i=1;i<=5;i++) {
			int taskId=i;
			executor.submit(()->System.out.println("Executing "+taskId +" by "+Thread.currentThread().getName()));
		}
		executor.shutdown();
	}
}

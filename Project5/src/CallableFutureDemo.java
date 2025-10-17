import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executor=Executors.newSingleThreadExecutor();
		
		Callable<Integer> task=()->{
			System.out.println("Calculating sum...");
			Thread.sleep(3000);
			return 10+20;
		};
		
		Future<Integer> future=executor.submit(task);
		System.out.println("Result ="+future.get());
		System.out.println("Job Done!!");

	}

}

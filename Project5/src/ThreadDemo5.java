import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class SumTask implements Callable<Integer>{
	int n;
	public SumTask(int n) {
		this.n=n;
	}
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=n;i++)
			sum=sum+i;
		
		System.out.println(Thread.currentThread().getName()+"sum ="+sum);
		return sum;
	}
	
}

public class ThreadDemo5 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService executor=Executors.newSingleThreadExecutor();
		Future<Integer> result= executor.submit(new SumTask(5));
		System.out.println(result.get());
		executor.shutdown();
	}

}

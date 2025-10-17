class Shared{
	private int data;
	private boolean hasData=false;
	synchronized void produce(int value) throws InterruptedException {
		while(hasData) {
			wait();
		}
		data=value;
		System.out.println("Produced :"+data);
		hasData=true;
		notify();//notify the consumer
	}
	synchronized void consume() throws InterruptedException {
		while(!hasData) {
			wait();
		}
		System.out.println("Consumed: "+data);
		hasData=false;
		notify();//notify the producer
	}
}
public class InterThreadCommunicationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shared shared=new Shared();
		Thread producer=new Thread(()->{
			for(int i=1;i<=5;i++) {
				try {
					shared.produce(i);
					Thread.sleep(500);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread consumer=new Thread(()->{
			for(int i=1;i<=5;i++) {
				try {
					shared.consume();
					Thread.sleep(1000);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	producer.start();
	consumer.start();
	}

}

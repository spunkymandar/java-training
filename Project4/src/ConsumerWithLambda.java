/* Lambda expression : 
 * (parameter)->{body}
 * 	
 */
import java.util.function.Consumer;
public class ConsumerWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Consumer<String> stringConsumer= (String x)->System.out.println("Hello ,"+x);
//		Consumer<String> stringConsumer= (x)->System.out.println("Hello ,"+x);
		Consumer<String> stringConsumer= x->System.out.println("Hello ,"+x);
		stringConsumer.accept("Java");
		
		Consumer<String> printer=s->System.out.println("Printing :"+s);
		Consumer<String> logger=s->System.out.println("Logging :"+s);
		
		Consumer<String> combined=printer.andThen(logger);
		combined.accept("Hello chain");
	}

}

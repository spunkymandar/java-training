import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create the streams from Collections
		List<Integer> list=Arrays.asList(10,20,50);
		Stream<Integer> stream1=list.stream();
		
		//Create a stream from Arrays
		Stream<Integer> stream2=Arrays.stream(new Integer[] {10,20,30});
		//IntStream stream4=Arrays.
		
		//from direct values
		Stream<Integer> stream3=Stream.of(10,20,30);
		
		//from formule or as a infinite stream
		Stream<Integer> stream4=Stream.iterate(0, n->n+2).limit(5);
		stream4.forEach(System.out::println);
		
		
		Stream<Double> stream5=Stream.generate(()->Math.random()).limit(3);
		//Stream<Double> stream5=Stream.generate(Math::random).limit(3);
		stream5.forEach(System.out::println);
	}

}

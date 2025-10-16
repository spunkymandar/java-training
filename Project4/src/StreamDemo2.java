/*
 * Intermediate operations in the Stream
 * filter(predicate)
 * distinct
 * limit
 * skip(n)
 * takeWhile(predicate)
 * dropWhile(predicate)
 * map(Fuction)
 * maptoInt, maptoLong
 * flatMap(Function, Stream<R>)
 */



import java.util.Arrays;
import java.util.stream.Stream;
import java.util.*;
public class StreamDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(10,20, 20,34,23,80,53,78);
		Stream<Integer> intstream=numbers.stream();
		//filtering and slicing
		intstream.filter(n->n%2==0).distinct().skip(1).limit(3).forEach(System.out::println);;
//		intstream.forEach(System.out::println);
				
		//mapping
		List<String> words=Arrays.asList("hello","world");
		words.stream().map(s->s.toUpperCase()).forEach(System.out::println);
//		words.stream().map(String::toUpperCase).forEach(System.out::println);
		
		//sorting
		Stream.of("Banana","Apple","Orange").sorted().forEach(System.out::println);
		
		
		
	}

}

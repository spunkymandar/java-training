import java.util.*;
import java.util.stream.*;

public class StreamDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Java 9 Update
		 * 		takeWhile
		 * 		dropWhile
		 * 		iterate
		 * 		ofNullable
		 */
		
//		Stream.of(1,2,3,4,1)
//				.takeWhile(n->n<4)
//				.forEach(System.out::println);
		
		Stream.of(1,2,3,4,1)
				.dropWhile(n->n<4)
				.forEach(System.out::println);
		
		Stream.iterate(0, n->n<5, n->n+1)
				.forEach(System.out::println);
		
		
		/*
		 * Java 10
		 * 		Collectors.toUnmodifiableList/Set/Map
		 */
		
		List<String> data=Stream.of("A","B")
							.collect(Collectors.toUnmodifiableList());
		System.out.println(data);
//		data.add("C");
		
		/*
		 * Java11
		 * 		toList
		 */
		
		List<String> data1 =Stream.of("A","B").toList();
		
		/*
		 * Java 12
		 * 		Collectors.teeing()
		 */
		
		Map<Boolean, Integer> map=Stream.of(1,2,3,4,5)
								.collect(Collectors.teeing(
											Collectors.summingInt(n->n), 
											Collectors.counting(), 
											(sum,count)->Map.of(sum%2==0,sum))
										 );
		System.out.println(map);		
		
		/*
		 * Java 16
		 * 		toList : is immutable List 
		 */
		
		List<String> data2 =Stream.of("A","B").toList();
		
		
	}

}

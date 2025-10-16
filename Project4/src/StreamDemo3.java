/*
 * Terminal operations
 * 		forEach
 * 		collect
 * 		reduce
 */

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listData=Stream.of("A","B","C").collect(Collectors.toList());
		System.out.println(listData);
		
		Map<String,Integer>  map= Stream.of("Jack","Dave","Wiley").collect(Collectors.toMap(s->s, String::length));
		System.out.println(map);
		
//		int sum=Stream.of(1,2,3).reduce(Integer::max);
		
	}

}

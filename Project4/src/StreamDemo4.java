import java.util.*;
import java.util.stream.*;

public class StreamDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits=Arrays.asList("Apple","Banana","Orange","Mango","Apple");
		List<String> result=fruits.stream()
								.filter(f->f.length()>4)
								.distinct()
								.map(String::toUpperCase)
								.sorted()
								.peek(f->System.out.println("Peeked:"+f))
								.collect(Collectors.toList());
		
		System.out.println(result);
		
		int totallength=fruits.stream().mapToInt(String::length).sum();
		System.out.println(totallength);
		
		boolean matchingfruit=fruits.stream().anyMatch(f->f.length()<4);
		System.out.println(matchingfruit);

	}

}

import java.util.*;
import java.util.function.*;
public class UnaryOperatorWithCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(12);
		numbers.add(23);
		
		numbers.replaceAll(n->n*5);
		
		numbers.forEach(System.out::println);
		
	}

}

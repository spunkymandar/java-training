import java.util.*;
import java.util.function.*;

public class PredicateWithCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(67);
		numbers.add(50);
		numbers.add(35);
		numbers.add(40);
		
		System.out.println("List before the removal:");
		numbers.forEach(System.out::println);
		
		numbers.removeIf(num->num%2==0);
		
		System.out.println("List after the removal: ");
		numbers.forEach(System.out::println);

		
	}

}

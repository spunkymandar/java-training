import java.util.*;
import java.util.function.*;

public class SupplierWithCollection {
	public static void main(String[] args) {
		Supplier<List<Integer>> listSupplier=()->new ArrayList<Integer>();
		
		List<Integer> numbers=listSupplier.get();
		numbers.add(10);
		numbers.add(34);
		numbers.add(12);
		
		numbers.forEach(System.out::println);
	}
}

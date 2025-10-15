/*
 * Set<-HashSet, LinkedHashSet
 * Set<--SortedSet<-TreeSet
 * HashSet: Unordered, one null, Fastest operations
 * LinkedHashset: ordered, one null
 * TreeSet: Sorted, No null, Sorting mechnism Red-black tree
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> fruits=new LinkedHashSet<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		
		fruits.add("Apple");//duplicate
		System.out.println(fruits);
		
		
		List<Integer> mylist=Arrays.asList(10,20,40);
		
		Set<Integer> myintset =new HashSet<Integer>(mylist);
		
		//working with utility class Arrays
		Set<Integer> myintset1 =new HashSet<Integer>(Arrays.asList(10,30,40));
		
		
		
//		fruits.
		
		Set<Integer> numbers=new TreeSet<Integer>();
		numbers.add(50);
		numbers.add(10);
		numbers.add(34);
		numbers.add(25);
		
		System.out.println(numbers);
		
		
		
		
		
		
	}

}





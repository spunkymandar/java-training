/*List<-ArrayList, LinkedList, Vector(Synchronized)
 * ArrayList: get/set
 * Linklist: insert/remove
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruits=new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Apple");//duplicate
		
		System.out.println(fruits);
		
		//for-each loop
		for(String fruit:fruits)
			System.out.println(fruit);
		
		//for loop
		for(int i=0;i<fruits.size();i++)
			System.out.println(fruits.get(i));
		
		//using iterator
		Iterator<String> itr=fruits.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		ListIterator<String> listitr=fruits.listIterator();
		while(listitr.hasNext())
			System.out.println(listitr.next());
		
		
		while(listitr.hasPrevious())
			System.out.println(listitr.previous());
		
		
		fruits.forEach((e)->System.out.println(e));
		
		
		System.out.println("Sorted Arraylist");
		Collections.sort(fruits);
		System.out.println(fruits);
		
		System.out.println("Sorted in descending order");
		fruits.sort((a,b)->b.compareTo(a));
		System.out.println(fruits);
		
		System.out.println("Banana present at:"+Collections.binarySearch(fruits, "Banana"));
		
		
		//List.of creates the immutable list
		List<String> names=List.of("Alice","John","Davis");
		names.add("Derek");
		
		
	}

}

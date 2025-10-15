/*
 * Map<K,V> <- HashMap(Unique), LinkedHashMap
 * Map ->SortedMap <- TreeMap (Sorted) 
 */

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Orange");
		map.putIfAbsent(3, "Apple");
		
		System.out.println(map);
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		//Java8 : Using BiConsumer as a argument in forEach. 
		map.forEach((key,value)->System.out.println(key+" "+value));
		
		//navigating through keys
		for(Integer key: map.keySet())
			System.out.println("key="+key);
		
		//navigating through values
		for(String value: map.values())
			System.out.println(value);
		
		
		//updates in Java8
		//forEach(biconsumer)
		//computeIfAbsent
		//computeIfPresent
		//merge
		//getOrDefault
		
		map.computeIfAbsent(103, k->"new fruit");
		System.out.println(map);
		
//		Map<Integer,String> map1=new TreeMap<Integer,String>();
//		map.put(5, "Apple");
//		map.put(2, "Banana");
//		map.put(1, "Orange");
//		map.put(3, "Apple");
//		
//		System.out.println(map);
	}

}

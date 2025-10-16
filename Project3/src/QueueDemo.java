/*
 * Queue : LinkedList, PriorityQueue, ArrayDeque
 * add: inserts elements
 * offer: inserts elements
 * remove: removes the head element
 * poll: removes the head elements
 * element: retrieve the element
 * peek: retrieve the elements 
 * 
 */
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Queue<String> queue1=new LinkedList<String>();
			//adding elements
			queue1.add("John");
			queue1.add("Derek");
			queue1.add("Smith");
			queue1.offer("Wilson");//safer 
			
			System.out.println(queue1);
			System.out.println("head element: "+queue1.poll());
			System.out.println("head element: "+queue1.peek());
			
			PriorityQueue<Integer> queue2=new PriorityQueue<Integer>();
			queue2.add(30);
			queue2.add(10);
			queue2.add(50);
			
			System.out.println(queue2);
			
			while(!queue2.isEmpty())
				System.out.println(queue2.poll());
			
			
			
	}

}

/*
 * Predicate<T>
 * boolean test(T t): Represnets a boolean-valued function of one arugment
 */
import java.util.function.Predicate;
public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Predicate<Integer> predicate1=new Predicate<Integer>() {
//
//			@Override
//			public boolean test(Integer t) {
//				// TODO Auto-generated method stub
//				return t%2==0;
//			}
//			
//		};
		
		//Check if the number is divisible by 2 or not
		Predicate<Integer> isEven=n->n%2==0;
		System.out.println(isEven.test(10));
		System.out.println(isEven.test(7));
		
		//Check if the string is empty 
		Predicate<String> isNotEmpty=s->s!=null && !s.isEmpty();
		System.out.println(isNotEmpty.test("Hello"));
		System.out.println(isNotEmpty.test(""));
		
		
		
		
		
		

	}

}

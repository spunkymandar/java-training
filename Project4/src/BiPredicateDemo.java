/*
 * BiPredicate :
 * boolean test(T t, U u)
 */

import java.util.function.*;
public class BiPredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer, Integer> isDivisble=(a,b)->a%b==0;
		
		System.out.println(isDivisble.test(10, 2));
		System.out.println(isDivisble.test(10, 6));
		
		BiPredicate<String, String> isEqual=(s1,s2)->s1.equalsIgnoreCase(s2);
		System.out.println(isEqual.test("Java", "java"));
		
	}

}

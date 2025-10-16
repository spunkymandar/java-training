

import java.util.function.*;
public class PredicateChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> isPositive=n->n>0;
		Predicate<Integer> lessThanHundred=n->n<100;
		
		//Combining Predicate
		Predicate<Integer> combined=isPositive.and(lessThanHundred);
		System.out.println(combined.test(125));

	}

}

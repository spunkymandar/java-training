import java.util.function.*;

public class BiFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<Integer,Integer,Integer> addTwoNumbers=(a,b)-> a+b;
		System.out.println(addTwoNumbers.apply(10, 2));
		
	}

}

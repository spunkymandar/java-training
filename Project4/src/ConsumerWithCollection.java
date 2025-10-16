import java.util.*;
import java.util.function.Consumer;

public class ConsumerWithCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits=Arrays.asList("Apple", "Banana","Orange");
		
		//fruits.forEach(Consumer)
//		fruits.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String s) {
//				// TODO Auto-generated method stub
//				System.out.println(s);
//			}
//			
//		});

		//fruits.forEach((String fruit)->System.out.println(fruit));
		
//		fruits.forEach((fruit)->System.out.println(fruit));
		
//		fruits.forEach(fruit->System.out.println(fruit));
		
		//Method Reference
		fruits.forEach(System.out::println);
		
		
		
	}

}

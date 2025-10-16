/*
 * Consumer is functional interface, that represents the operation which: 
 * 1. accepts a single input of type T
 * 2. It returns nothing (void)
 * @FuctionalInterface
 * public interface Consumer<T>{
 * 	void accept(T t)
 * }
 * 
 * $ accpept(T t) : main and only one abstract method
 * $ andThen(Consumer<? super T> after ) : default method to chain the cosume
 * 
 */

import java.util.function.Consumer;

//class PrintConsumer implements Consumer<String>{
//
//	@Override
//	public void accept(String s) {
//		// TODO Auto-generated method stub
//		System.out.println("Printing : "+s);
//	}
//	
//}

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Consumer<String> consumer1=new PrintConsumer();
//		consumer1.accept("Java");
		
		//anonymous inner class implementation
		Consumer<String> consumer1=new Consumer<String>() {

			@Override
			public void accept(String s) {
				// TODO Auto-generated method stub
				System.out.println("Printing :"+s);
			}
			
		};
		consumer1.accept("Java");
		
		
		
	}

}

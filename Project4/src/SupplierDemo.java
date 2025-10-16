import java.util.*;
import java.util.function.*;
public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Supplier<Double> randomSupplier=()->Math.random();
		System.out.println(randomSupplier.get());
		
		BooleanSupplier sup1=()->true;
	}

}

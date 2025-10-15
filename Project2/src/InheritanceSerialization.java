import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class InheritanceSerialization {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Car car1=new Car("Tesla", 4, "Model S", 99999.9);
		
		//Serialization
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("car.txt"))){
			oos.writeObject(car1);
			System.out.println("Car is serialized");
		}
		catch(IOException ioe) {
			
		}
		
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("car.txt"))){
			Car c=(Car)ois.readObject();
			System.out.println(c);
		}
		catch(IOException ioe) {
			System.out.println("Cannot deserialize");
		}
		

	}

}

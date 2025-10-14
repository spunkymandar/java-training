import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address1=new Address("Mumbai", "India");
		
		Person person1=new Person("John", 32, address1);
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("person.txt"))){
			oos.writeObject(person1);
			System.out.println("Person object serialized");
		}
		catch(Exception ie) {
			System.out.println("something went wrong!"+ie);
		}
	}

}

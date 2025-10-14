import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable{
	String name;
	int age;
	transient Address address;
	public Person(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();//serialize the default fields
		oos.writeUTF(address.city);
		oos.writeUTF(address.country);
	}
	
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject(); // deserialize default fields
        // manually deserialize Address
        String city = ois.readUTF();
        String country = ois.readUTF();
        address = new Address(city, country);
    }

	

}

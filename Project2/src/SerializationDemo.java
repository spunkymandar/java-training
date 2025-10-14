import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student("John", 16, "John123");
		//serialization
//		
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("student.txt"))){
			oos.writeObject(student1);
			System.out.println("Object is serialized");
		}
		catch(IOException ie) {
			System.out.println("Exception occured!");
		}
		
		//deserialization
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("student.txt"))){
			Student s=(Student)ois.readObject();
			System.out.println("Deserialized object :");
			System.out.println(s);
		}
		catch(IOException  | ClassNotFoundException ce) {
			System.out.println("Exception occurec!");
		}

	}

}

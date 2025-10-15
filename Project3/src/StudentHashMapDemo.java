import java.util.HashMap;
import java.util.Map;

public class StudentHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Student> studentMap=new HashMap<Integer,Student>();
		
		studentMap.put(101, new Student(1,"John"));
		studentMap.put(102, new Student(2,"Derek"));
		studentMap.put(103, new Student(3,"Wiley"));
		
		studentMap.forEach((id,student)->System.out.println(id+" =>"+student.getName()));
	}

}

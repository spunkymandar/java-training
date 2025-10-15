import java.util.HashSet;
import java.util.Set;

public class StudentHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Student> mystudents=new HashSet<Student>();
		
		mystudents.add(new Student(1,"Mandar"));
		mystudents.add(new Student(2,"John"));
		mystudents.add(new Student(1,"Mandar"));
		
//		Student s1=new Student(1,"Mandar");
//		Student s2=new Student(1,"Mandar");
//		System.out.println(s1.hashCode()+" "+s2.hashCode());
		
		System.out.println(mystudents);
		
	}

}

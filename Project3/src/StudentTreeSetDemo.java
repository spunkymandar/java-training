import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StudentTreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> studentTreeSet=new TreeSet<Student>();
		Student s1=new Student(2,"John");
		Student s2=new Student(1,"Wiley");
		Student s3=new Student(3,"Smith");
		
		studentTreeSet.add(s1);
		studentTreeSet.add(s2);
		studentTreeSet.add(s3);
		
		System.out.println(studentTreeSet);
		List<Student> mylist=new ArrayList<Student>(studentTreeSet);
		
		Collections.sort(mylist, new StudentNameComparator());
		System.out.println(mylist);
	}

}

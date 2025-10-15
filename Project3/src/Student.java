import java.util.Objects;

public class Student implements Comparable<Student>{
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals method invoked by :"+this.name);
		// TODO Auto-generated method stub
		Student s=(Student)obj;
		if(this.id==s.id && Objects.equals(this.name, s.name))
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.length()+3;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		
		return Integer.compare(o.id, this.id);
	}
	
	

}

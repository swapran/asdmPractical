package StudentRecord;

public class StudentMain {

	public static void main(String[] args) {
		Student s1  = new Student(1,"Ram");
		Student s2  = new Student(2,"Lakshman");
		Student s3  = new Student(3,"Janaki");
		Student s4  = new Student(4,"Hanuman");
		
		Hello h1 = new Hello();
		h1.hello(s1);
	}

}

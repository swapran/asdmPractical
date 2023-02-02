package StudentRecord;

public class Student {
	//fields
	private int rollNo;
	private String name;
	
	//constructors
	public Student() {}
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	//getters and setters
	public int getRollNo() {return rollNo;}
	public void setRollNo(int rollNo) {this.rollNo = rollNo;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	//method
	@Override
	public String toString() {
		return "StudentInfo [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	

}

package StudentRecord;

public class SubjectMarks {
	//fields
	private int math;
	private int	science;
	private int marathi;
	private int english;
	
	//constructors
	public SubjectMarks() {}
	public SubjectMarks(int math, int science, int marathi, int english) {
		this.math = math;
		this.science = science;
		this.marathi = marathi;
		this.english = english;
	}
	
	//getters and setters
	public int getAsdm() {return math;}
	public void setAsdm(int math) {this.math = math;}
	public int getOs() {return science;}
	public void setOs(int science) {this.science = science;}
	public int getOopWithJava() {return marathi;}
	public void setOopWithJava(int marathi) {this.marathi = marathi;}
	public int getDotNet() {return english;}
	public void setDotNet(int english) {this.english = english;}
	
	//method
	@Override
	public String toString() {
		return "SubjectMarks [math=" + math + ", science=" + science + ", marathi=" + marathi + ", english=" + english+ "]";
	}
	
	
}

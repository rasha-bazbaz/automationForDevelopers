
public class FirstClassEastech {
	int numOfEng;
	String courseName;
	
	public FirstClassEastech(int numOfEng, String courseName) {
		this.courseName = courseName;
		this.numOfEng = numOfEng;
		System.out.println("The course that named "+courseName+" has "+numOfEng+" Engineers");
	}
	public String getCourseName() {
		return this.courseName;
	}
}

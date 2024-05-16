
class Student {
	
	String major;
	int studentNumber;

	Student(String major, int studentNumber) {
		this.major = major;
		this.studentNumber = studentNumber;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void printInfo() {
		System.out.printf("전공 : %2s\n", this.major);
		System.out.printf("전공 : %2d\n", studentNumber);
		System.out.println();
	}
}

public class EjQuiz0513 {

	public static void main(String[] args) {
		System.out.println("<학생 A 정보>");
		Student studentA = new Student("경영", 2015);
		studentA.printInfo();
		
		System.out.println("<학생 B 정보>");
		Student studentB = new Student("식품영양과", 2017);
		studentB.printInfo();
		
		System.out.println("학생 B 전과 신청");
		studentB.setMajor("법학");
		studentB.printInfo();
	}
}
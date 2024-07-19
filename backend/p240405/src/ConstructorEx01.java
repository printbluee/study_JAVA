
class Student {
	
	// field : instance field
	int age;
	String name;
	
	// constructor
	Student() {}	
	
	Student(int age) {
		this.age = age;
	}
	
	// setter
	void setAge(int age) {
		this.age = age;
	}
	
	void showInfo() {
		System.out.println("나이 >> " + age);
	}
	
}

public class ConstructorEx01 {

	public static void main(String[] args) {
		
		// 홍길동 객체(인스턴스) 생성
		System.out.println("** 홍길동 학생 정보 **");
		Student hong = new Student(25); // () = 객체를 만들면서 생성자를 호출
		hong.showInfo();
		hong.setAge(26); // 추후 나중에 값설정을 할 때
		hong.showInfo();
		
		// 박보검 객체(인스턴스) 생성
		System.out.println("** 박보검 학생 정보 **");
		Student park = new Student(); 
		park.showInfo();
		park.setAge(35);
		park.showInfo();
		
		
		/*
		 * [ constructor 와 setter 의 차이 ]
		 * <내가 쓴 것>
		 * 생성자는 객체가 생성될 때 자동으로 호출이 가능하지만,
		 * setter 는 객체가 이미 생성된 후에 호출이 된다.
		 * 
		 * 생성자는 멤버변수의 초기값을 설정하는데 사용되고,
		 * setter 는 멤버변수의 값을 설정하는데 사용된다.
		 * 
		 * 
		 * <강사님이 쓴 것>
		 * 
		 * 				 constructor		   setter
		 * ----------------------------------------------------
		 * 기능 		field 값 설정		field 값 설정
		 * 시기			객체 생성 시		객체 생성 후
		 * 의미			초기화				값 변경
		 * 
		 */
		
	}

}

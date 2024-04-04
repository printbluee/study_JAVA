
class Person {
	
	// 멤버 변수 : instance field
	int age;
	String name;
	
	// 멤버 메서드 : instance method
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class InstanceEx06 {
	
	// [ 메서드 정의 ] =======================================================
	// 메서드명 : show, 매개변수 : ??, 리턴값 : 없음
	public static void show(Person objectName) {
		System.out.println("이름 : " + objectName.getName() );
		System.out.println("나이 : " + objectName.getAge() );
	}
	

	public static void main(String[] args) {

		// hong 객체 생성, 멤버 변수 값 설정 - 나이 설정 : 25, 이름 : 홍길동
		Person hong = new Person();
		hong.setName("홍길동");
		hong.setAge(25);
		// 출력
//		System.out.println("이름 : " + hong.getName());
//		System.out.println("나이 : " + hong.getAge());
		
		// park 객체 생성, 멤버 변수 값 설정 - 나이 설정 : 35, 이름 : 박보검
		Person park = new Person();
		park.setName("박보검");
		park.setAge(35);
		// 출력
//		System.out.println("이름 : " + park.getName());
//		System.out.println("나이 : " + park.getAge());
		
		
		// 메소드 show 출력 ====================================================
		show(hong);
		show(park);
	}
}

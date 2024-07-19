
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
	// 메서드명 : show, 매개변수 : 참조형, 리턴값 : 없음
	public static void show(Person person) {
		// 직관성을 높이기 위해 타입명과 지역변수명(person)이 같도록 함
		// Person 타입으로 만들어진 객체를 가져오는 것
		// 매개변수에 참조변수가 들어온 것
		// 인스턴스(객체)의 주소를 받겠다
		System.out.println("이름 : " + person.getName() );
		System.out.println("나이 : " + person.getAge() );
	}
	

	public static void main(String[] args) {

		// hong 객체 생성, 멤버 변수 값 설정 - 나이 설정 : 25, 이름 : 홍길동
		// Person : 참조 변수 / hong : 지역 변수
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
		// 하나씩 실행이 되면서 메모리에 원하는 값을 가져오고 나면 
		// 메모리상에는 show()가 사라지고 또 다시 생성하여 park 을 입력 받음
		// main 메소드에서 객체의 주소만 알면 접근이 가능함
		show(hong); // 참조 변수 hong 을 넣을 것
		show(park);
		
		// 일정 시간이 지나면 자바에 JVM 안에 메모리 관리 메소드가 있는데
		// 특정 객체를 아무도 안쓰면 Garbage(GC) 컬렉션 실행
		// 그럼 메모리상에서 사라짐
		
		// show(Person class 객체의 주소);
		show(new Person()); // 
		
	}
}

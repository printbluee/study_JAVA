package modifier;

class Person {
	private int age;
	private String name;
	
	public Person(int age, String name) {  // private error ! 메모리 할당 후 생성자 실행이여야함
//		super(); // object 가 부모			// 그래서 new Person(25, "홍길동"); 부분이 에러뜸
		this.age = age;
		this.name = name;
	}
	
	
	
}

public class Ex02 {
	public static void main(String[] args) {
		
		Person p = new Person(25, "홍길동");
		// p.age = 26; 	// .age error ! private 의 접근 권한
						// 외부 접근을 통합 field 값 변경은 불가능
						// 멤버 메소드를 통한 값 변경(setter)
	}
}

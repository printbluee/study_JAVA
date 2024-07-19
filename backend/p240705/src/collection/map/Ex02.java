package collection.map;

import java.util.HashMap;
import java.util.Map;

class Person {
	
	private String name; 
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class Ex02 {

	public static void main(String[] args) {

		Person hong = new Person("홍길동", 25);
		Person park = new Person("박보검", 35);

		// [유형 1] ===================================================================
		// 기본 타입은 못옴 ex) int
		HashMap<Integer, Person> one = new HashMap<Integer, Person>();
		
		one.put(1, hong);
		one.put(2, park);
		
		// [유형 2] ===================================================================
		// 저장이 되는 객체를 특정 Key 를 사용할 수 있음
		// 이미 만들어진, 생성된 인스턴스에 저장된 값 중에 이름을 쓸 수 있음 -> String 타입으로 해줘야 함
		// String 의 최상위 모듈은 Object 이기 때문에 가능함 
		//Map<String, Person> two = new HashMap<String, Person>();
		Map<Object, Person> two = new HashMap<Object, Person>();
		
		two.put(hong.getName(), hong); // 이미 생성된 인스턴스의 필드의 값을 key 값으로 설정해준 것
		two.put(hong.getName(), park); 
		
		// [유형 3] ===================================================================
		// DB 에 테이블 지정할 때 많이 사용
		Map<Object, Object> three = new HashMap<Object, Object>();
		three.put("name", hong.getName());
		three.put("age", hong.getAge());
		
		
	}
}

package method.reference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Person {
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
	
	// 메서드 추가
	public void returnName (Person person) {
		System.out.println(person.getName());
	}
	
	public static void returnNameStatic (Person person) {
		System.out.println(person.getName());
	}
}


public class MethodReferenceQuiz {
	
	public static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for(T t: list) {
			consumer.accept(t);
		}
	}

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<Person>();
		
		persons.add(new Person("홍길동", 29));
		persons.add(new Person("박보검", 35));
		persons.add(new Person("이미자", 52));
		
		System.out.println("main() 메서드에서 실행한 persons ===========");
		for(Person p: persons) {
			System.out.println(p);
		}
		System.out.println();
		
		// [문제 1] 정의한 forEach문 사용 ===============================
		System.out.println("[문제 1] 정의한 forEach문 사용 =============");
		// [문제 1-1] 이름과 나이를 출력 : toString() -------------------
		// [익명 클래스]
		System.out.println("[익명 클래스]");
		forEach(persons, new Consumer<Person>() {
			@Override
			public void accept(Person p) {
				System.out.println(p.toString());
			};
		});
		System.out.println();
		
		// [람다]
		// 익명이 있기 때문에 람다를 사용할 수 있는 것
		// 단축키 : 익명 클랙스 블럭 지정 후 컨트롤 + 1
		System.out.println("[람다]");
		// forEach(persons, (Person p) -> System.out.println(p.toString()));
		forEach(persons, p -> System.out.println(p));
		System.out.println();
		
		// [메서드참조]
		System.out.println("[메서드참조]");
		forEach(persons, System.out::println);
		System.out.println();
		
		
		// [문제 1-2] 이름만 출력 : getName() ----------------------------
		System.out.println("[문제 1-2] 이름만 출력 : getName() ==========");
		// [람다]
		System.out.println("[람다]");
		// forEach(persons, (Person p) -> System.out.println(p.getName()));
		forEach(persons, p -> System.out.println(p.getName()));
		System.out.println();
		
		// [메서드참조]
		System.out.println("[메서드참조]");
		// System.out::println 로 되지 않기 때문에 
		// class 쪽에 returnName() 메서드 추가 (아래 코드 참고)
		// forEach(persons, System.out::println);
		System.out.println();
		
		// returnName() 메서드 사용
		System.out.println("returnName() 메서드 사용 ===============");
		// [익명 클래스]
		System.out.println("[익명 클래스]");
		forEach(persons, new Consumer<Person>() {
			@Override
			public void accept(Person p) {
				p.returnName(p);
			}
		});
		System.out.println();
		
		// [람다]
		System.out.println("[람다]");
		forEach(persons, p -> p.returnName(p));
		System.out.println();
		
		// [메서드 참조]
		System.out.println("[메서드 참조] - returnName");
		forEach(persons, new Person()::returnName); // non-static
		System.out.println();
		System.out.println("[메서드 참조] - returnNameStatic"); 
		forEach(persons, Person::returnNameStatic); // static
		System.out.println();
		// ===============================================================
		
		// [문제 2] ArrayList의 forEach문 사용 ===========================
		System.out.println("[문제 2] ArrayList의 forEach문 사용 ==========");
		// [문제 2-1] 이름과 나이를 출력 : toString() --------------------
		System.out.println("[문제 2-1] 이름과 나이를 출력 : toString()");
		// [람다]
		System.out.println("[람다]");
		persons.forEach(p -> System.out.println(p));
		System.out.println();
		
		// [메서드참조]
		System.out.println("[메서드참조]");
		persons.forEach(System.out::println);
		System.out.println();
		
		
		// [문제 2-2] 이름만 출력 : getName() ----------------------------
		System.out.println("[문제 2-2] 이름만 출력 : getName() ===========");
		// [람다]
		System.out.println("[람다]");
		persons.forEach(p -> System.out.println(p.getName()));
		System.out.println();
		
		// [메서드참조]
		System.out.println("[메서드참조]");
		persons.forEach(new Person()::returnName); // non-static
		persons.forEach(Person::returnNameStatic); // static
		
		
	}
}

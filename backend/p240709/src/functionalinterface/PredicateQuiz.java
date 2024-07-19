package functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

public class PredicateQuiz {
	
	public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> result = new ArrayList<T>();
		
		for(T t: list) {
			if(predicate.test(t)) {
				result.add(t);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		List<Person> person = new ArrayList<Person> ();
		
		person.add(new Person("홍길동", 29));
		person.add(new Person("박보검", 35));
		person.add(new Person("이미자", 52));
		
		System.out.println("person 요소 출력");
		for(Person p : person) {
			System.out.println(p.getName());
		}
		System.out.println();

		// [문제] 나이가 30세 이상만 추출
		// filter method 사용
		// [익명 클래스] 
		Predicate<Person> predicateOne = new Predicate<Person>() {
		    @Override
		    public boolean test(Person p) {
		        return p.getAge() >= 30;
		    }
		};
		List<Person> filteredPersonOne = filter(person, predicateOne);
		
		System.out.println("[익명] person 요소 필터 적용 후 출력");
		for (Person l : filteredPersonOne) {
			System.out.println(l.getName());
		}
		System.out.println();
		
		// [람다]
		Predicate<Person> predicateTwo = (p) -> p.getAge() >= 30;
		List<Person> filteredPersonTwo = filter(person, predicateTwo);
		
		System.out.println("[람다] person 요소 필터 적용 후 출력");
		for (Person l : filteredPersonTwo) {
			System.out.println(l.getName());
		}
		
	}
}

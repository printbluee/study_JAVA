package inner.anonymous;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Collections;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showInfo() {
		System.out.printf("이름 : %s, 나이 : %d\n", name, age);
	}

	protected String getName() {
		return name;
	}

	protected int getAge() {
		return age;
	}
}

public class anonymousQuiz {

	public static void main(String[] args) {

		HashSet<Person> hashSet = new HashSet<Person>();

		hashSet.add(new Person("홍길동", 29));
		hashSet.add(new Person("박보검", 35));
		hashSet.add(new Person("이미자", 52));
		
		System.out.println(hashSet.toArray());
		
//		Iterator<Person> iter = hashSet.iterator();
//		while (iter.hasNext()) {
//			iter.next().showInfo();
//		}

		// [문제] 이름을 기준으로 오름차순 정렬 ============================
		// set : 중복 허용 x, 순서 보장 x
		// 그래서 set 으로 정렬할 땐 타입을 바꿔주기
		// << HashSet 정렬 방법 >>
		// [방법 1] HashSet 을 List 변환한 후 정렬 --> 이 방법으로 해결
		// [방법 2] HashSet 을 HashTree 변환한 후 정렬
		// [방법 3] Stream 을 이용하여 HashSet 정렬 (★)
		// =================================================================⭐

		// [1-1] Comparator 인터페이스 구현
//		Comparator<Person> comparator = new Comparator<Person>() {
//			@Override
//			public int compare(Person p1, Person p2) {
//				// 이름 기준으로 오름차순 정렬
//				// return p1.getName().compareTo(p2.getName());
//				
//				// [과제] 나이 기준으로 오름차순 정렬
//				return p2.getAge() - p1.getAge();
//			}
//		};
		
		// [과제] 위 코드를 람다로 표현
		Comparator<Person> comparator = (Person p1, Person p2) -> p2.getAge() - p1.getAge();
		
		
		// [1-2] hashSet 을 ArrayList 로 변환 (복사본)
		// ArrayList 객체 생성
		ArrayList<Person> arrayList = new ArrayList<Person>(hashSet);
		
//		for(Person p : hashSet) {
//			arrayList.add(new Person(p.getName(), p.getAge()));
//		}
//		System.out.println("hashSet   >> " + hashSet);
//		System.out.println("arrayList >> " + arrayList);
		
		System.out.println("<< 정렬 전 >>");
		for(Person p : arrayList) {
			p.showInfo();
		}
		
		// [1-3] 오름차순 정렬
		arrayList.sort(comparator);

		// [1-4] 출력하여 확인
		System.out.println("\n<< 정렬 후 >>");
		for(Person p : arrayList) {
			p.showInfo();
		}
	}
}

package stream;

import java.util.Arrays;
import java.util.List;

class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
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
		return "이름 : " + name + " - 나이 : " + age;
	}
	
	// 중복 제거를 위해 hashCode 와 equals 재정의하여 Override
	@Override
	public int hashCode() {
		return (name + age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student person = (Student) obj; 
			return name.equals(person.name) && (age == person.age);
		} 
		return false;
	} 
}

public class StreamQuiz01 {

	public static void main(String[] args) {
		
		// Student 1차원 배열 생성
		Student[] students = {
				new Student("홍길동", 29),
				new Student("박보검", 35),
				new Student("이미자", 52),
				new Student("박보검", 35),
		};
		
		// Student 1차원 배열 -> List 변환
		List<Student> list = Arrays.asList(students);
		
		// [Stream] 이름과 나이가 같은 객체를 제외하여 출력
		// 중간연산 : distinct() 사용
		// filter 사용 x 이유 : 
		list.stream()
			.distinct()
			.forEach(System.out::println);
			;
	}
}

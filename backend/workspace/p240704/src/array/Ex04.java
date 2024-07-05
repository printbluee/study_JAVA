package array;

import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		Person hong = new Person("홍길동", 25);
		Person park = new Person("박보검", 35);
		Person lee = new Person("이미자", 52);
		
		ArrayList<Person> array = new ArrayList<Person>();
		
		array.add(hong);
		array.add(park);
		array.add(lee);
		
		System.out.println("[array] -->> " + array);
		
		// [shallow copy: 얕은 복사] ==================================
		//Object shallowCopy = array.clone();
		ArrayList<Person> shallowCopy = (ArrayList<Person>) array.clone();
		System.out.println("[shallowCopy]" + shallowCopy);
		
		// [deep copy: 깊은 복사] ==================================
		//Object[] deepCopy = array.toArray();// 깊은복사 아님 >> 배열만 복사
		ArrayList<Person> deepCopy = new ArrayList<Person>();
		for (Person p : array) {
			deepCopy.add(p.clone());
		}
		
		System.out.println("[deepCopy]" + deepCopy);
		//System.out.println("[deepCopy]" + Arrays.toString(deepCopy));
		
		// [array] 인덱스0 : 홍길동 -> 해피
		array.get(0).setName("해피");
		
		System.out.println("[array] 인덱스0 : 홍길동 -> 해피");
		System.out.println("[array]");
		
		for (Person p : array) {
		System.out.println(p.getName());
		}
		
		System.out.println("[shallowCopy]");
		for (Person p : (ArrayList<Person>) shallowCopy) {
			System.out.println(p.getName());
		}
		
		System.out.println("[deepCopy]");
		for (Person p : deepCopy) {
			System.out.println(p.getName());
		}
		
		// [shallowCopy] 인덱스0 : 인스턴스 변경(새 인스턴스)
		shallowCopy.set(0, new Person());
		
		System.out.println("[shallowCopy] 인덱스 0에 저장된 인스턴스 변경 후");
		System.out.println("[array]");
		
		for (Person p : array) {
			System.out.println(p.getName());
		}
		
		System.out.println("[shallowCopy]");
		for (Person p : (ArrayList<Person>) shallowCopy) {
			System.out.println(p.getName());
		}
		
		System.out.println("[deepCopy]");
		for (Person p : deepCopy) {
			System.out.println(p.getName());
		}
		
		System.out.println("[array] -->> " + array);
		System.out.println("[shallowCopy]" + shallowCopy);
	}
}
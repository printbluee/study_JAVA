package array;

class Person implements Cloneable {
	
    private String name;
    private int age;

    public Person () {};

    public Person(String name, int age) {
        this.setName(name);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.printf("이름 : %s, 나이 : %d\n\n", name, age);
    }

    protected Person clone() throws CloneNotSupportedException {
        return (Person)super.clone();
    }

}

public class Ex02 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		// 1. [ shallow copy : 얕은 복사 ] =========================
		Person p = new Person("홍길동", 25);
		System.out.println("[ 원본 p ]");
		p.show(); // 이름 : 홍길동, 나이 : 25
		
		Person copy_one = p;
		System.out.println("[ copy_one ]");
		copy_one.show(); // 이름 : 홍길동, 나이 : 25
		
		System.out.println("p        주소 >> " + p);
		System.out.println("copy_one 주소 >> " + copy_one);
		
		System.out.println("\n[ copy_one ] 홍길동 -> 박보검");
		copy_one.setName("박보검"); // 이름 : 박보검, 나이 : 25
		copy_one.show();
		
		System.out.println("[ 원본 p ]");
		p.show(); // 이름 : 박보검, 나이 : 25
		
		/*
		 * 복사가 된 것은 배열의 주소를 복사한거라 반영이 됨
		 */
		
		System.out.println("===============================================");
		
		// 2. [ deep copy : 깊은 복사 ] ============================
		Person p2 = new Person("홍길동", 25);
		System.out.println("[ 원본 p2 ]");
		p2.show(); // 이름 : 홍길동, 나이 : 25
		
//		Person copy_two = new Person();
//		copy_two.setName(p2.getName());
//		copy_two.setAge(p2.getAge());
		Person copy_two = p2.clone();
		
		System.out.println("p2       주소 >> " + p2);
		System.out.println("copy_two 주소 >> " + copy_two);
		
		System.out.println("\n[ copy_two ]");
		copy_two.show(); // 이름 : 홍길동, 나이 : 25
		
		System.out.println("[ copy_two ] 홍길동 -> 박보검");
		copy_two.setName("박보검");
		copy_two.show(); // 이름 : 박보검, 나이 : 25
		
		System.out.println("[ 원본 p2 ]");
		p2.show(); // 이름 : 홍길동, 나이 : 25
		
	}
}

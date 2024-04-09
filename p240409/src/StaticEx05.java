
class Cat {
	
	// field
	static int count;
	String name;
	
	// method
	static void showCount() {
		System.out.println("몇 마리 : " + count);
	}
	
	void setName(String name) {
		this.name = name;
	}
 	
	void showInfo() {
		System.out.println("이름 : " + name);
	}
	
}

public class StaticEx05 {

	public static void main(String[] args) {

		// static 멤버 접근 =========================
		// 클래스명.멤버이름 
		Cat.showCount();		// static method
		Cat.count = 3;			// static field
		
		// instance 멤버 접근 =========================
		Cat cat = new Cat();
		cat.setName("미미");	// instance method
		cat.showInfo();			// instance method
		
	}
}

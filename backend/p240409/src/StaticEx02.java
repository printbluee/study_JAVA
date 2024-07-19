
class Baseball {
	// [ static(class) field ]
	static int count;
	
	// [ instance method ]
	void increment() {
		count++; // Baseball.count 이 아니라 같은 멤버라서 이렇게 쓰는 것
	}

	void decrement() {
		count--;
	}
	
	void basevallInfo() {
		System.out.println("현재 개수 : " + count);
	}
}

public class StaticEx02 {

	public static void main(String[] args) {
		
		System.out.println("개수 : " + Baseball.count);
		
		Baseball b1 = new Baseball();
		b1.increment();
		b1.basevallInfo();
		
		Baseball b2 = new Baseball();
		b2.increment();
		b2.basevallInfo();
		System.out.println("개수 : " + Baseball.count);
	
	}
}

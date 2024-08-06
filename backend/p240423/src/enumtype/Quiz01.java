package enumtype;

enum Shoes {
	WALKING("워킹화"), RUNNING("런닝화"), TRACKING("트래킹화"), HIKING("등산화");
	
	private final String name;
	
	private Shoes(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() { // toString 을 안하면 s.getName 에서 s 만 해도 됨
		return this.name;
	}
}

public class Quiz01 {

	public static void main(String[] args) {

		// field 에 저장된 값 
		System.out.println("<< 상수 출력 >>");
		for (Shoes s: Shoes.values()) {
			System.out.println(s);
		}
		
		// 서수(정수)
		System.out.println("\n<< 서수 출력 >>");
		for (Shoes s: Shoes.values()) {
			System.out.println(s.ordinal());
		}
	}
}
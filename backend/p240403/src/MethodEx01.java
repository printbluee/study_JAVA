
public class MethodEx01 { // MethodEx01 클래스

	// [ increment method ] =====================
	public static void increment(int one) {
//		int var = 100;
		one++;
		System.out.println("1 증가 >> " + one);
	}
	
	// [ main method ] =====================
	public static void main(String[] args) {
		int one = 1;
		increment(one); // 인수(변수)
		System.out.println("one >> " + one);
	}
}

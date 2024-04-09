
public class StaticEx06 {

	// [ 메서드 정의 ] ==============================
	// static 을 붙여야 하는 이유
	// : main 메소스도 static 영역에 들어가기 때문에 
	static void sum(int n1, int n2) {
		int result = n1 + n2;
		System.out.println("덧셈 결과 : " + result);
	}
	
	// [ main method ] ==============================
	public static void main(String[] args) {
		
		sum(1, 3);
	}
	
}

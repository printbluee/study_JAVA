
public class MethodEx04 {

	// [ main method ] ================
	public static void main(String[] args) {

		// 방법 1. 변수 저장
		String str = returnString();
		System.out.println("변수 저장 : returnString() 호출 결과 >> " + str);
		
		// 방법 2. 바로 사용
		System.out.println("바로 사용 : returnString() 호출 결과 >> " + returnString());

	}
	
	// [ method 정의 ] ================
	// [ 형태 4 ] 매개변수 없고, 리턴 있음
	// 기능 : 호출하면 문자열 리턴
	// 메소드명 : returnString, 매개변수 : x
	
	public static String returnString() {
		
		return "안녕";
	}

}

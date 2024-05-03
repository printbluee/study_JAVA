
public class TypeEx01 {
	public static void main(String[] args) {
		
		// 문자 : 'a' (문자 하나) - 작은 따옴표
		// 문자열 : "adsd" (문자 조합) - 큰 따옴표 구분 해조야함
		// char = 2byte , 컴파일이 되면(정수) 메모리엔 97이 넣게 됨, a = x
		char ch1 = 'a';
		System.out.println("ch1 : " + ch1);  // 쉼표 안됨, + 해야함
		
		// 타입이 char, 65-> A 라서 그대로 출력, 보기 편하기 위해 A 라고 하는게 나음
		// char ch2 = 65;
		char ch2 = 'A'; 
		System.out.println("ch2 : " + ch2); 
		
		// 더하기 가능함 왜냐 ? 정수
		char ch3 = 'A' + 1; 
		System.out.println("ch3 : " + ch3);
	}
}
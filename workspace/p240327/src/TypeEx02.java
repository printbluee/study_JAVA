
public class TypeEx02 {

	public static void main(String[] args) {
		
		// 정수형 리터럴(100)
		int num1 = 100;
		System.out.println("num1 : " + num1);
		
		// The literal 10000000000 of type int is out of range 
//		int num2 = 10000000000;
//		System.out.println("num2 : " + num2);
		
		// 정수형 리터럴(10000000000)
		// 10000000000이 정수였다가(기본 : int) 접미사 L를 붙이면 long이 됨
		long num3 = 10000000000L;
		System.out.println("num3 : " + num3);
		
		
		// 실수형 리터럴(2.34)
		double num4 = 2.34;
		System.out.println("num4 : " + num4);
		
		// Type mismatch: cannot convert from double to float
//		float num5 = 2.34;
//		System.out.println("num5 : " + num5);
		
		// 실수형 리터럴(2.34)
		// 실수형 자료의 기본은 더블이기에 정밀도때문에 이것또한 접미사 F 붙임
		float num5 = 2.34F;
		System.out.println("num5 : " + num5);
		
		
		// 논리형 리터럴(true)
		// true = 예약어
		boolean bo = true;
		System.out.println("논리값 : " + bo);
		 
		
		// 문자형 리터럴(A,65)
		char ch = 'A'; // 65 넣어도 됨(int)
		System.out.println("문자형 리터럴 : " + ch);
		
		
		// 문자열 리터럴(ㅎㅇ)
		String st = "ㅎㅇ";
		System.out.println("문자열 리터럴 : " + st);
	}
}

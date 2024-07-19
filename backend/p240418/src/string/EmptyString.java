package string;

public class EmptyString {

	public static void main(String[] args) {

		String one = "";  		// 빈 문자열   , 주소 o
		String two = " "; 		// 공백	       , 주소 o
		String three = null; 	// 문자열 없음 , 주소 x
		
		// 출력
		System.out.println("one >> " + one);
		System.out.println("two >> " + two);
		System.out.println("three >> " + three);
		
		// [ 빈 문자열 확인 1 ] equals() : 문자열 비교
		System.out.println("\n<< equals() : 문자열 비교 >>");
		System.out.println("one : " + one.equals(""));
		System.out.println("two : " + two.equals(""));
		// error ! NPE(NullPointException)
		// System.out.println("three : " + three.equals(""));
		
		// [ 빈 문자열 확인 2 ] length() : 문자열 길이
		System.out.println("\n<< length() : 문자열 길이 >>");
		System.out.println("one : " + one.length());
		System.out.println("two : " + two.length());
		// error ! NPE(NullPointException)
		// System.out.println("three : " + three.length());

		// [ 빈 문자열 확인 3 ] isEmpty() : true, false 여부
		// : Java 6 이후 추가
		// if (one.lenth() == 0) => if (one.isEmpty())
		System.out.println("\n<< isEmpty() : true, false 여부 >>");
		System.out.println("one : " + one.isEmpty());
		System.out.println("two : " + two.isEmpty());
		// error ! NPE(NullPointException)
		// System.out.println("three : " + three.isEmpty());
		
		// [ 빈 문자열 확인 4 ] isBlank() : true, false 여부
		// : Java 11 이후 추가
		// : 빈 문자열 or 공백만으로 이뤄진 경우 true 리턴
		// : 공백 = white space(화이트 스페이스)
		System.out.println("\n<< isBlank() : true, false 여부 >>");
		System.out.println("one : " + one.isBlank());
		System.out.println("two : " + two.isBlank()); 
		// error ! NPE(NullPointException)
		// System.out.println("three : " + three.isBlank());
		
	}
}

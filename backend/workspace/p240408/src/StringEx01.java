
public class StringEx01 {

	public static void main(String[] args) {

		// [ 문자열 ] 문자 여러 개 연속
		// 배열과 같은 형태로 메모리에 할당됨
		String s1 = "안녕";
		// String s2 = "안녕";
		String s3 = new String("안녕");
		String s4 = new String("안녕");
		
		System.out.println("s3 >> " + s3); // tostring()이 자동으로 붙어서 주소가 아니라 문자열이 출력이 됨
		System.out.println("s4 >> " + s4);
		
		// = : 주소 비교
		if (s3 == s4) { // 출력이 아닌 비교라서 주소로 비교가 됨
			System.out.println("주소 같음");
		} else {
			System.out.println("주소 다름");
		}
		 
		// equals() : 문자열 비교
		if (s3.equals(s1)) {
			System.out.println("같은 문자열");
		} else {
			System.out.println("다른 문자열");
		}
		
		
	}
}

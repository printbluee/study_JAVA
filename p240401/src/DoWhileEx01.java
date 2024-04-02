
/* 
 * [ 반복문 ] do ~ while 문
 * 
 * 조건에 상관없이, 반복문 처음 한 번은 꼭 실행하고자 할 때
 * 
 *  do {
 *  	명령어;
 *  	명령어;
 *  	명령어;
 *  } while (조건식); 
 */


public class DoWhileEx01 {

	public static void main(String[] args) {
		
		int idx = 10; // 초기값
		
//		// [while 문]		
//		while (idx < 10) { // 조건식
//			System.out.println("idx >> " + idx);
//			idx++; // 증감식
//		}
//		
		// [do ~ while]
		do { // 조건식
			System.out.println("idx >> " + idx);
			idx++; // 증감식
		} while (idx < 13); 
		
		System.out.println("반복문 실행 후 idx >> " + idx);
		
	}

}

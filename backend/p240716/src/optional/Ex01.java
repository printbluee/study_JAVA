package optional;

import java.util.Arrays;
import java.util.List;

/*
 * [Optional] ===============================================
 * - null 이 올 수 있는 값을 감싸는 Wrapper class
 * - NPE (NullPointerException) 가 발생하지 않도록 함
 *   (감싸고 있으니까 발생 x)
 * - 유용한 여러 메서드를 제공
 * ==========================================================
 */

public class Ex01 {

	public static void main(String[] args) {

		List <String> result = Arrays.asList("홍길동", "박보검", "이미자");
		
		for (String s : result) {
			if (s.equals("이미자")) {
				System.out.println(s);
			}
		} 
		
	}
}

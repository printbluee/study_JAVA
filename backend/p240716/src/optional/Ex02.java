package optional;

import java.util.Arrays;
import java.util.List;

public class Ex02 {

	public static String findByName(String name) {
		List <String> result = Arrays.asList("홍길동", "박보검", "이미자");
		
		for (String s : result) {
			if (s.equals(name)) {
				return s;
			}
		} 
		return null;
	}
	
	public static void main(String[] args) {

		System.out.println("[이름 찾기] 1. 이미자 >> " + findByName("이미자"));
		System.out.println("[이름 찾기] 2. 하늘 >> " + findByName("하늘"));
		
		System.out.println("이미자 길이 >> " + findByName("이미자").length());
		
		/*
		 * [NullPointerException]
		 * 보통 작업을 할 때 메서드를 호출하여 작업을 하는데
		 * return 이 null 인 경우 error 가 발생이 될 수 있음 ()
		 */
		// System.out.println("하늘 길이 >> " + findByName("하늘").length()); // error !
		
		String findName = findByName("하늘");
		if (findName != null) {
			System.out.println("하늘 길이 >> " + findByName("하늘").length());
		} 
		
	}
}
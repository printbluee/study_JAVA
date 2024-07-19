package method.reference;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {

		String[] arr = { "A", "c", "E", "d", "b" };
		
		// 정렬 : 오름차순으로 정렬 ================================
		// 원본 변경
		// 아스키코드표를 보면 대문자부터 있기 때문에 
		// 대문자 -> 소문자 순으로 출력
		Arrays.sort(arr); 
		System.out.println("정렬 : 오름차순으로 정렬");
		System.out.println(Arrays.toString(arr)); // [A, E, b, c, d]
		System.out.println();
		
		
		// 정렬 : 대소문자 구번없이 오름차순 정렬 ===================
		// 확인할 때마다 위에 있는 코드 주석처리
		// 람다 볼 때 익명 클래스 코드 주석, 
		// 메서드참조 볼 때 익명 + 람다 코드 주석
		System.out.println("정렬 : 대소문자 구번없이 오름차순 정렬");
		// 1) 익명 클래스
		System.out.println("1) 익명 클래스");
//		Arrays.sort(arr, new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				return s1.compareToIgnoreCase(s2);
//			}
//		});
//		
//		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		// 2) 람다
		System.out.println("2) 람다");
//		Arrays.sort(arr, (s1, s2) -> s1.compareToIgnoreCase(s2));
//		
//		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		// 3) 메서드 참조
		System.out.println("3) 메서드 참조");
		Arrays.sort(arr, String::compareToIgnoreCase);
		
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		
	}
}

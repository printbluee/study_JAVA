package inner.anonymous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// 정렬


public class Ex04 {

	public static void main(String[] args) {

		// ArrayList 
		ArrayList<String> hangul = new ArrayList<String>();
		
		hangul.add("하늘");
		hangul.add("바람");
		hangul.add("돌");
		hangul.add("나비");
		System.out.println("정렬 전 >> " + hangul);
		System.out.println();
		
		// [오름차순 정렬] 1. Collections.sort()
		System.out.println("<< [오름차순 정렬] 1. Collections.sort() >>");
		Collections.sort(hangul);
		System.out.println("정렬 후 >> " + hangul);
		
		// cf) 내림차순 정렬
		Collections.sort(hangul, Collections.reverseOrder());
		System.out.println("내림차순 정렬 후 >> " + hangul);
		System.out.println();
		
		// [오름차순 정렬] 2. List.sort() : Java 8 이후
		System.out.println("<< [오름차순 정렬] 2. List.sort() : Java 8 이후 >>");
		hangul.sort(Comparator.naturalOrder());
		System.out.println("오름차순 정렬 >> " + hangul);
		
		// cf) 내림차순 정렬
		hangul.sort(Comparator.reverseOrder());
		System.out.println("내림차순 정렬 후 >> " + hangul);
		System.out.println();
		
		// [오름차순 정렬] 3. 사용자 정의 : Comparator 인터페이스 구현
		/*
		 * << String class : compareTo() method >>
		 * ex) 5 1 3 6 -> 1 5 3 6 -> 1 3 5 6
		 *     8 9 3 1 -> 8 3 9 1 -> 3 8 9 1 -> 3 8 1 9 -> 3 1 8 9 -> 1 3 8 9
		 * 양수 : 순서 교체 -> 첫 번째 인수 크다. 기준 크다. : 첫번째인수.compareTo(두번째인수)
		 * 음수 : 순서 유지 -> 첫 번째 인수 작다. 기준 작다. 
		 * 0    : 순서 유지 -> 서로 같다 
		 */
		System.out.println("<< [오름차순 정렬] 3. 사용자 정의 : Comparator 인터페이스 구현 >>");
		Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2); // 오름
//				return o2.compareTo(o1); // 내림
			}
		};
		
		// 1. 오름차순
		// A : 65
		// B : 66
		// C : 67
		// [데이터 순서] CAB
		System.out.println("C 와 A 비교 >> " + "C".compareTo("A")); // 2
		
		// [데이터 순서] ACB
		System.out.println("C 와 B 비교 >> " + "C".compareTo("B")); // 1
		
		// [데이터 순서] ABC
		// System.out.println("B 와 A 비교 >> " + "B".compareTo("A")); // 1
		
		
		// 오름차순 정렬
		hangul.sort(comparator);
		System.out.println("정렬 후 >> " + hangul);
		
	}
}
package stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/*
 * [Stream] 스트림
 * << 스트림 생성 >>
 * : 배열, 컬렉션
 * 
 * << 3단계 >>
 * : 생성 -> 가공 -> 결과
 * : Stream 객체 생성 -> 중간연산 -> 최종연산
 * 
 * << 특징 >>
 * : 원본 데이터를 변경하지 않음 - 복사본
 * : 일회용
 * : 내부 반복으로 작업 처리
 */

public class Ex01 {

	public static void main(String[] args) {

		// ==========================================
		// [작업] 1차원 배열을 오름차순 정렬 후 출력
		// ==========================================
		
		// [방법 1]
		// 1차원 배열 생성
		String[] arr = { "하나", "둘", "셋", "넷" };
		
		// 1) 정렬 : 오름차순
		Arrays.sort(arr);
 		
		// 2) 출력
		for (String s: arr) {
			System.out.println(s);
		}
		
		
		// [방법 2] 스트림 
		// 1차원 배열 생성
		String[] arrTwo = { "하나", "둘", "셋", "넷" };
		
		// 1) Stream 객체 생성
		Stream<String> stream = Arrays.stream(arrTwo);
		
		// 2) 오름차순 정렬 후 출력
		System.out.println("\n[stream] 오름차순 정렬 후 출력");
		stream.sorted().forEach(ar -> System.out.println(ar));
		
		// error ! : stream has already been operated upon or closed
		// : Stream 으로 생성된 객체는 일회용
		// : 사용한 Stream 객체를 다시 사용(재사용) 하면 Exception 발생
		// : 새 Stream 생성 - Arrays.Stream(배열)
		// stream.distinct().forEach(ar -> System.out.println(ar));
		
		// [원본] arrTwo 배열 출력
		System.out.println("\n[원본] arrTwo 배열 출력");
		for(String s : arrTwo) {
			System.out.println(s);
		}
		
		// 1) 새 스트림 객체 생성
		stream = Arrays.stream(arrTwo);
		
		// 2) 내림차순 정렬 후 출력
		System.out.println("\n[새 stream] 내림차순 정렬 후 출력");
		stream.sorted(Collections.reverseOrder()).forEach(ar -> System.out.println(ar));
		
		// [메서드 참조] 오름차순 정렬 후 출력
		System.out.println("\n[메서드 참조] 오름차순 정렬 후 출력");
		Arrays.stream(arrTwo)
			.sorted()
			.forEach(System.out::println);
		
	}
}

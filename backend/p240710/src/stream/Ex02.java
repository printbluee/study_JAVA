package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex02 {

	public static void main(String[] args) {

		// List 객체 생성
		List<String> list = Arrays.asList("하늘 바람", "별 자리", "솔 바람", "하늘 구름");
		
		// stream 객체 생성
		Stream<String> stream = list.stream();
		
		// [문제] forEach문 사용하여 출력 : 메서드 참조
		stream.forEach(System.out::println);
		
		// ================================================================
		// [Stream 사용법] Stream 생성 -> 중간연산(가공) -> 최종연산(결과)
		// ================================================================
		
		// [중간연산] filter ==============================================
		// * 조건에 맞는 요소만 정제하여 새 스트림 객체 생성
		// * filter 매개변수 : Predicate
		// * Predicate : 추상 메서드 test - 매개변수 1개, 리턴있음(boolean)
		// ================================================================
		
		System.out.println("\n[바람이 포함된 문자열 출력]");
		// 1) Stream 객체 생성
		Stream<String> streamTwo = list.stream();
		
		// 2) 중간연산 : filter
		// f 타입 : String
		// 타입이 String 이기 때문에 변수에 저장할 수 이음
		// streamTwo.filter(f -> f.contains("바람"));
		Stream<String> result = streamTwo.filter(f -> f.contains("바람"));
		
		// 3) 최종연산 : forEach
		result.forEach(System.out::println);
		
		// [stream pipelines] 스트림 파이프 라인
		// 위 작업을 한 코드 라인으로 변경 (1~3)
		System.out.println("\n[Stream] 조건에 맞는 요소 출력 2)");
		
		// List<String> list = Arrays.asList("하늘 바람", "별자리", "솔바람", "하늘 구름");
		list.stream()
			.filter(f -> f.contains("바람")) // 순회하면서 contains("키워드") 로 검사하여 맞다면 true
			.forEach(System.out::println);   // 
		
		
		// [문제] ===========================================================
		System.out.println("\n[문제] 문자열의 길이가 5 이상 요소만 출력");
		
		list.stream()
			.filter(f -> f.length() >= 5)
			.forEach(System.out::println);
		

		// ===================================================================
		// [중간연산] map
		// * Stream 요소들을 변환하여 새 stream 생성
		// * 형태를 변환할 때 많이 사용
		// * 주로 저장된 값을 특정한 형태로 변환하는데 사용 ex) 소문자 -> 대문자
		// * Function : 매개변수 1개, 리턴 있음 
		// ===================================================================
		
		System.out.println("\n<< [map] 공백 제거 >>");
		list.stream()
			.map(s -> s.replace(" ", ""))
			.forEach(System.out::println);
		
		System.out.println("\n<< [map] 하늘, 공백 제거 >>");
		list.stream()
			.map(s -> s.replace("하늘", "").replace(" ", ""))
			.forEach(System.out::println);
		
		// [중간연산] sorted 1) 오름차순
		System.out.println("\n<< [sorted] 오름차순 정렬 >>");
		list.stream()
			.sorted()
			.forEach(System.out::println);
		
		// [중간연산] sorted 1) 내림차순
		System.out.println("\n<< [sorted] 내림차순 정렬 >>");
		list.stream()
//			.sorted(Collections.reverseOrder())
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
		
		// [문제] 길이가 5 이상 요소를 공백 제거 후에 오름차순 정렬
		System.out.println("\n[문제] 길이가 5 이상 요소를 공백 제거 후에 오름차순 정렬");
		list.stream()
			.filter(f -> f.length() >= 5)
			.map(m -> m.replace(" ", ""))
			.sorted()
			.forEach(System.out::println);
		
		// ===================================================================
		// [중간연산] peek
		// * Stream 요소에 영향을 주지 않고, 특정 작업 수행
		// * Consumer : 매개변수 1개, 리턴 없음 
		// ===================================================================
		System.out.println("\n<< [peek] 짝수 합 : 중간 출력 >>");
		// IntStream : interface
		int sum = IntStream.of(10, 15, 20, 25, 30)
			.filter(f -> (f % 2) == 0)
			.peek(System.out::println) // 중간에 프린트 찍기
			.sum();
		System.out.println("짝수 합 >> " + sum);
		
		
		// ===================================================================
		// [중간연산] distinct
		// * 중복된 Stream 요소 제거
		// * Consumer : 매개변수 1개, 리턴 없음 
		// ===================================================================
		System.out.println("\n<< [distinct] 중복 요소 제거 >>");
		IntStream.of(1, 3, 5, 7, 5, 7, 9)
			.distinct()
			.forEach(System.out::println);
		
		
		// ===================================================================
		// [중간연산] mapto
		// * 형변환, 타입 변경
		// * mapIoInt(), mapToLong(), mapToDouble()
		// * mapToObject
		// * Consumer : 매개변수 1개, 리턴 없음 
		// ===================================================================
		System.out.println("\n<< [mapto] 정수 -> 실수 변경 후, 평균 구하기 >>");
		double avg = IntStream.range(1, 3)
			.peek(System.out::println)
			.mapToDouble(n -> n) // 형변환 int -> double
			.peek(System.out::println)
			.average()
			.getAsDouble() // 값만 뽑아오기, return 타입 : double
			;
		
		System.out.println("평균 >> " + avg);
		
	}
}

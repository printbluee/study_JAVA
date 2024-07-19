package stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex03 {

	public static void main(String[] args) {

		// [최종연산] ===============================================
		// min, max, average
		// : 리턴형 - Optional
		// : 빈 stream 일 경우, Optional.Empty 리턴
		// ==========================================================
		
		// [min]
		OptionalInt min = IntStream.of(1, 3, 5, 7, 9).min();
		System.out.println("최솟값 : " + min); // min : OptionalInt[1]
		
		// OptionalInt[1] 값 가져오기 : .getAsInt()
		int minInt = IntStream.of(1, 3, 5, 7, 9)
				.min()
				.getAsInt(); // return type : int 라 변수의 type 도 int 로 변경
		System.out.println("최솟값 : " + minInt); // 최솟값 : 1
		
		
		OptionalInt minEmpty = IntStream.of().min();
		System.out.println("최솟값 : " + minEmpty); // OptionalInt.empty
		
		// [max]
		OptionalInt max = IntStream.of(1, 3, 5, 7, 9).max();
		System.out.println("최댓값 : " + max); // 최댓값 : OptionalInt[9]

		// [average]
		OptionalDouble avg = IntStream.of(1, 3, 5, 7, 9).average();
		System.out.println("평균값 : " + avg); // OptionalDouble[5.0]
		
		
		// =================================================================
		// [문제] 평균값 출력
		IntStream.of(1, 3, 5, 7, 9)
			.average()
			.ifPresent(System.out::println); // 5.0
		
		// =================================================================
		// sum, count 는 빈 Stream 일 경우 0 리턴
		// =================================================================
		int sum = IntStream.of(1, 3, 5, 7, 9).sum();
		System.out.println("합 >> " + sum); // 합 >> 25
		
		int sumEmptyStream = IntStream.of().sum();
		System.out.println("[빈 Stream] 합 >> " + sumEmptyStream); // [빈 Stream] 합 >> 0
		 
		// 개수가 많을 수 있어서 타입이 int 가 아닌 long
		long count = IntStream.of(1, 3, 5, 7, 9).count();
		System.out.println("개수 >> " + count); // 개수 >> 5
		
		long countEmptyStream = IntStream.of().count();
		System.out.println("[빈 Stream] 개수 >> " + countEmptyStream); // [빈 Stream] 개수 >> 0
		
		
		// =================================================================
		// [최종 연산] Match
		// 조건 검사
		// Stream 의 요소들이 특정한 조건을 충족하는지 검사하고 싶은 경우
		// Predicate 를 받아 해당 조건 만족 여부 검사 : boolean 반환
		// << match 메서드 3가지 >>
		// anyMatch  : 1개의 요소라도 해당 조건을 만족하는가
		// allMatch  : 모든 요소가 해당 조건을 만족하는가
		// noneMatch : 모든 요소가 해당 조건을 만족 하지 않는가
		// =================================================================
		
		List<String> names = Arrays.asList("홍길동", "박보검", "이미자");
		
		// [anyMatch] 하나의 요소라도 해당 조건에 충족된다면
		// 하나라도 충족된다면 모든 요소를 돌지 않음
		boolean anyMatch = names.stream().anyMatch(name -> name.contains("미"));
		System.out.println("\n[anyMatch] '미' 가 포함된 이름이 하나라도 있는가 ? " + anyMatch);
		
		// [allMatch] 모든 요소가 조건에 충족된다면 true
		// 하나라도 충족 되지 않는다면 모든 요소를 돌지 않음
		boolean allMatch = names.stream().allMatch(name -> name.contains("미"));
		System.out.println("\n[allMatch] 모든 요소에 '미' 가 포함되었는가 ? " + allMatch);
		
		// [noneMatch] 모든 요소가 조건에 총족되지 않는다면 true
		boolean noneMatch = names.stream().noneMatch(name -> name.contains("미"));
		System.out.println("\n[nonMatch] 모든 요소에 '미' 가 포함되지 않았다면 ? " + noneMatch);

		
		// =================================================================
		// [collect] 데이터 수집
		// stream 요소들을 List, Set, Map 등 다른 type 으로 수집
		// 형변환
		// =================================================================
		
		// Student 1차원 배열 생성
		System.out.println("\nStudent 1차원 배열 생성");
		List<Student> students = Arrays.asList(
			new Student("홍길동", 29),
			new Student("박보검", 35),
			new Student("이미자", 52),
			new Student("박보검", 35)
		);
		
		List<String> nameList = students.stream()
			// Student : class, toString : method
			// 원래 문법 에러가 날 수 있지만, students 를 보고 멤버를 추정할 수 있어서 에러 x
		    // 참조변수때문에 인스턴스 메서드도 스태틱 메서드처럼 사용 가능
		    // 많이 쓰이는 형태
			.map(Student::toString) 
			.collect(Collectors.toList()); // type 이 List 니까 List 타입으로 변수에 저장
		System.out.println(nameList);
		
		
	}
}

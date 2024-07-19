package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamQuiz02 {

	public static void main(String[] args) {

		// [문제] 문자열 길이 기준으로 오름차순 정렬 후 출력
		// C - Java - Python - Java Script
		List<String> language = Arrays.asList("Python", "C", "Java", "Java Script");
			
		language.stream()
			.sorted((s1, s2) -> s1.length() - s2.length())
			.forEach(System.out::println);
		
		language.stream()
			.sorted(Comparator.comparingInt(String::length))
			.forEach(System.out::println);
	}
}

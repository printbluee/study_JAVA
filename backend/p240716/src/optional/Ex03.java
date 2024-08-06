package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Ex02 복제, 보완된 코드
public class Ex03 {

	public static Optional<String> findByName(String name) {
		List <String> result = Arrays.asList("홍길동", "박보검", "이미자");
		
		// ==================================================================================
//		for (String s : result) {
//			if (s.equals(name)) {
//				
//				 return Optional.ofNullable(s); // 이게 제일 깔끔
//				// return Optional.of(s);
//				// return new Optional(s);      // error ! 생성자 private
//			}
//		} 
//		
//		/* Optional 에서 오버로딩된 toString 을 보면 "Optional.empty" 이 return 되어야 하는데
//		 * null 로 했으니 null 로 return
//		 * return null;
//		 */
//		return Optional.empty();
		// ==================================================================================
		
		// [과제] stream 변경
		// findFirst() 
		// : filter 조건에 일치하는 element 1개를 Optional 로 리턴, 조건에 일치하는 요소가 없다면 empty 리턴
		Optional<String> findName = 
				result.stream()
					.filter(f -> f.equals(name))
					.findFirst(); 
		return findName;
	}
	
	public static void main(String[] args) {

		System.out.println("[이름 찾기] 1. 이미자 >> " + findByName("이미자")); // Optional[이미자]
		System.out.println("[이름 찾기] 2. 하늘 >> " + findByName("하늘"));     // null -> Optional.empty
		
//		System.out.println("이미자 길이 >> " + findByName("이미자").length());
		System.out.println("이미자 길이 >> " + findByName("이미자").get().length());
		
//		String findName = findByName("하늘");
//		if (findName != null) {
//			System.out.println("하늘 길이 >> " + findByName("하늘").length());
//		} 
		
		Optional <String> sky = findByName("하늘");
		// isPresent() : return value != null; -> 값이 있니 ! 
		// isEmpty()   : return value == null; -> 값이 없니 !
		if (sky.isPresent()) {
			System.out.println("하늘 길이 >> " + findByName("하늘").get().length());
		}
	}
}
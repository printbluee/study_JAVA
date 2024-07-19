package collection.map;

import java.util.HashMap;

public class Ex01 {

	public static void main(String[] args) {

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		// 요소 개수
		System.out.println("[요소 추가 전] 개수 >> " + hashMap.size());
		
		// 요소 추가
		hashMap.put("하나", 1);
		hashMap.put("둘", 2);
		hashMap.put("셋", 3);
		hashMap.put("하나", 100); // 마지막 요소가 들어감
		System.out.println("hashMap >> " + hashMap.toString());
		
		hashMap.put("넷", 4);
		
		// 요소 전체 출력
		// {} 형태
		// System.out.println("hashMap >> " + hashMap);
		System.out.println("hashMap >> " + hashMap.toString());
		
		// 요소 개수
		System.out.println("[요소 추가 후] 개수 >> " + hashMap.size());
		
		// 저장된 key 들의 집합 : 키만 추출
		// 키는 중복 허용 x
		System.out.println("\n<< 저장된 모든 key 추출 >>");
		System.out.println(hashMap.keySet());
		
		// 저장된 값들의 집합 : 값만 추출
		// 값은 중복 허용 o, 배열 형태로 출력
		System.out.println("\n<< 저장된 모든 value 추출 >>");
		System.out.println(hashMap.values());
		
		// key 를 통한 값 추출 : 특정 key 의 값 
		System.out.println("\n키가 '하나'인 요소의 값 >> " + hashMap.get("하나"));
		
		// key 를 통한 값 변경 
		System.out.println("\n하나 키의 값 변경 전 >> " + hashMap);
		hashMap.replace("하나", 200);
		System.out.println("\n하나 키의 값 변경 gn >> " + hashMap);
		
		System.out.println("\n하나 요소 삭제 전 개수 >> " + hashMap.size());
		hashMap.remove("하나");
		System.out.println("\n하나 요소 삭제 후 개수 >> " + hashMap.size());
		
		/* [과제] put() 과 replace() 차이
		 * put() 
		 * : put() 의 기본 동작은 지정된 키와 값을 map 에 추가하거나 이미 존재하는 키의 현재 값을
		 *   새 값으로 대체
		 * : 키가 존재하든 아니든 값을 저장하거나 대체함
		 * 
		 * replace() 
		 * : 지정된 키가 map 에 없으면 변경 사항 없음
		 * : 지정된 키가 이미 맵에 있을 경우 해당 키의 현재 값을 새 값으로 대체
		 */
	}
}

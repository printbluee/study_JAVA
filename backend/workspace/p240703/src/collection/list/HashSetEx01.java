package collection.list;

import java.util.HashSet;

public class HashSetEx01 {

	public static void main(String[] args) {
		
		// Java.util.HashSet 공식 문서 보기
		HashSet<String> hashSet = new HashSet<String>();
		
		// 저장된 요소 존재 여부
		System.out.println("비어있나요 ? >> " + hashSet.isEmpty()); // true
		
		// 요소 추가
		hashSet.add("하나");
		hashSet.add("둘");
		hashSet.add("셋");
		hashSet.add("하나");
		
		// 저장된 요소 존재 여부
		System.out.println("비어있나요 ? >> " + hashSet.isEmpty()); // false
		
		// 요소 개수
		System.out.println("저장된 요소 개수 >> " + hashSet.size()); // 3
		
		// 전체 요소 출력
		// 출력값 : [둘, 하나, 셋]
		// 저장한 순서 보장 x, 중복값 제거
		System.out.println("전체 요소 출력 >> " + hashSet); 
		
		// 특정 위치에 저장된 요소 출력
		// error ! : 순서를 보장하지 않기 때문에 인덱스 사용하지 못함
		// System.out.println("인덱스 0 >> " + hashSet.get(0));
		
		// 객체 존재(포함) 여부
		System.out.println("'하나' 있나요 ? >> " + hashSet.contains("하나")); // true
		System.out.println("'다섯' 있나요 ? >> " + hashSet.contains("다섯")); // false
		
		// [저장된 요소 전체 출력]
		// 1. toArray()
		
		// 2. 향상된 for문 : x
		
		// 3. iterator()
		
		
		
	}
}
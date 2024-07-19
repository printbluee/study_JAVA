package array;

import java.util.Arrays;

public class Ex01 {
	
	public static void main(String[] args) {
		
		// 1. 길이가 3인 배열 생성
		String[] str = new String[3];
		str[0] = "one";
		str[1] = "two";
		str[2] = "three";
		// str[3] = "four"; error ! 배열의 길이가 3이라
		System.out.println(str);
		
		// 2. 저장된 문자열 출력
		// 2-1) 향상된 for문
		for(String s : str) {
			System.out.println(s);
		};
		
		System.out.println(Arrays.toString(str)); // 라이브 러리
		System.out.println("\n");
		
		// 3. 배열 복사
		// Ex02 보고 올 것
		// 3-1) shallow copy : 얕은 복사
		System.out.println("[shallow copy : 얕은 복사]");
		String[] shallowCopy = str; 
		System.out.println("얕은 복사 str : " + Arrays.toString(shallowCopy));
		System.out.println("얕은 복사 str : " + Arrays.toString(shallowCopy));
		
		System.out.println("\n<< [인덱스 1] two -> ten 변경 >>");
		shallowCopy[1] = "ten";
		
		System.out.println("원본      str : " + Arrays.toString(str));
		System.out.println("얕은 복사 str : " + Arrays.toString(shallowCopy));
		System.out.println("\n");
		
		// 3-2) deep copy : 깊은 복사
		System.out.println("[deep copy : 깊은 복사]");
		String[] deepCopy = Arrays.copyOf(str, str.length);
		System.out.println("원본      str : " + Arrays.toString(str));
		
		System.out.println("\n<< [인덱스 0] one -> 하나 변경 >>");
		deepCopy[0] = "하나";
		System.out.println("원본      str : " + Arrays.toString(str));
		System.out.println("깊은 복사 str : " + Arrays.toString(deepCopy));
		
		System.out.println("\nstr         >> " + str);
		System.out.println("shallowCopy >> " + shallowCopy);
		System.out.println("deepCopy    >> " + deepCopy);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

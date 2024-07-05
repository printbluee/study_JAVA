package array;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {

		String[] str = new String[3];
		
		str[0] = "하나";
		str[1] = "둘";
		str[2] = "셋";
		
		System.out.println("str 길이 >> " + str.length);
		System.out.println("str 에 저장된 요소 >> " + str); // 배열의 주소
		System.out.println("str 에 저장된 요소 >> " + Arrays.toString(str));
		
		// [배열의 길이 증가]
		// <직접>
		// 1. 새 배열 생성
		String[] newArr = new String[10];
		
		// 2. 요소 복사
		for(int i=0; i < str.length; i++) {
			newArr[i] = str[i];
		}
		
		System.out.println("newArr >> " + Arrays.toString(newArr));
		
		// 3. 배열 주소 변경
		str = newArr;
		
		System.out.println("str 길이 >> " + str.length);
		System.out.println("str 에 저장된 요소 >> " + Arrays.toString(str));
		
		
		// << 메소드 사용 >>
		str = Arrays.copyOf(str, 20);
		System.out.println("str 길이 >> " + str.length);
		System.out.println("str 에 저장된 요소 >> " + Arrays.toString(str));
		
		
		
		
		
		
		
	}
}
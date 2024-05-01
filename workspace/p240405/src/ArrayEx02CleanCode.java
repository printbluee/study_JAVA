
public class ArrayEx02CleanCode {

	public static void main(String[] args) {
		
		// [ 학생들의 수학 점수 저장 ]
		
		// 1. 배열 생성과 동시에 요소 초기화
		// 반드시 길이 생략
		// int[] math = new int[] {80, 95, 90, 70, 100};
		int[] math = {80, 95, 90, 70, 100};
		
		// 2. 배열 요소(원소)에 저장된 값 출력
		// 2-1. for 문
		for (int i=0; i<math.length; i++) {
			System.out.println("math[" + i + "] >> " + math[i]);
		}
		
		// 2-2. [ enhanced for loop ] 향상된 for 문 : 배열에서 사용
		for (int element: math) {
			System.out.println(element);
		}
		
		
	} 
}
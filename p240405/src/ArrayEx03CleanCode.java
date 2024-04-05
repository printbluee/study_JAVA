

public class ArrayEx03CleanCode {

	public static void main(String[] args) {
		
		// [ 1차원 배열 ] 길이가 1개인 배열
		int[] arr = new int[5];
		// 자료형[] 참조변수 = new 자료형[열길이];
		
		
		// [ 2차원 배열 ] 길이가 2개인 배열
		// 배열 생성과 동시에 초기화
		int[][] arr2 = new int[2][3];
		
		// 2. 값 설정
//		arr2[0][0] = 2;
//		arr2[0][1] = 4;
//		arr2[0][2] = 6;
//		arr2[1][0] = 8;
//		arr2[1][1] = 10;
//		arr2[1][2] = 12;
		
		// 3. 값 출력
		// 3-1. 중첩 for 문
		System.out.println("중첩 for 문");
		for (int i=0; i<2; i++) {		// 행
			for (int j=0; j<3; j++) {	// 열
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 3-2. 중첩 for 문: 내장변수 length 사용
		System.out.println("중첩 for문 : 내장변수 length 사용");
		for (int i=0; i<2; i++) {		// 행
			for (int j=0; j<3; j++) {	// 열
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 3-3. 중첩된 향상된 for 문
		System.out.println("중첩된 향상된 for 문");
		for (int i=0; i<arr2[0].length; i++) {		// 행
			for (int j=0; j<arr2[1].length; j++) {		// 행
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	} 
}












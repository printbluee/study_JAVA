

public class ArrayEx03 {

	public static void main(String[] args) {
		
		// [ 1차원 배열 ] 길이가 1개인 배열
		int[] arr = new int[5];
		// 자료형[] 참조변수 = new 자료형[열길이];
		System.out.println("arr >> " + arr);
		
		
		// [ 2차원 배열 ] 길이가 2개인 배열
		int[][] arr2 = new int[2][4];
		// 자료형[][] 참조변수 = new 자료형[행길이][열길이];
		System.out.println("arr2 >> " + arr2);
		
		// 2차원 배열의 참조변수
		// arr2 	: 참조변수 - 행의 시작 주소
		// arr2[0]	: 참조변수 - 첫 번째 1차원 배열의 시작 주소
		// arr2[1]	: 참조변수 - 두 번째 1차원 배열의 시작 주소
		System.out.println("arr2 >> " + arr2);
		System.out.println("arr2[0] >> " + arr2[0]);
		System.out.println("arr2[1] >> " + arr2[1]);
		System.out.println("[행 길이] arr2.length >> " + arr2.length);
		System.out.println("[인덱스 0행 : 열의 길이] arr2[0].length >> " + arr2[0].length);
		System.out.println("[인덱스 1행 : 열의 길이] arr2[1].length >> " + arr2[1].length);
		System.out.println();
		
		// 2. 값 설정
		arr2[0][0] = 2;
		arr2[0][1] = 4;
		arr2[0][2] = 6;
		arr2[1][0] = 8;
		arr2[1][1] = 10;
		arr2[1][2] = 12;
		
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
		for (int i = 0; i < arr2.length; i++) {			// 행 : Outer loop
		    for (int j = 0; j < arr2[i].length; j++) {	// 열 : Inner loop  
		        System.out.print(arr2[i][j] + " ");
		    }
		    System.out.println();
		}
		System.out.println();
		
		// 과제 ======================================
		// 3-3. 중첩된 향상된 for 문
		System.out.println("중첩된 향상된 for 문 (기본값 0 출력하지 않음)");
		for (int[] row : arr2) { 
			// System.out.println("int[] row : arr2 >> " + row); // arr2 의 주소 출력
		    for (int value : row) {
		        if (value != 0) { // 값이 0이 아닌 경우에만 출력
		            System.out.print(value + " ");
		        }
		    }
		    System.out.println();
		}
		
	} 
}
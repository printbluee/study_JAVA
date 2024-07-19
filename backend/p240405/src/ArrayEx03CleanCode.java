

public class ArrayEx03CleanCode {

	public static void main(String[] args) {
		
		// [ 1차원 배열 ] 길이가 1개인 배열
		// 자료형[] 참조변수 = new 자료형[열길이];
		// 자료형[] 배열명   = new 자료형[열길이];
//		int[] arr = new int[5];
		int[] arr = new int[] {1, 3, 5, 7,  9};
		System.out.println("arr >> " + arr + "\n");
		
		// [ 2차원 배열 ] 길이가 2개인 배열
		// 배열 생성과 동시에 초기화
		// int[][] arr2 = new int[2][3];
		int[][] arr2 = {{2, 3, 4},{8}};
		
		
		// 2. 값 설정
//		arr2[0][0] = 2;
//		arr2[0][1] = 4;
//		arr2[0][2] = 6;
//		arr2[1][0] = 8;
//		arr2[1][1] = 10;
//		arr2[1][2] = 12;
		
		// 출력
		System.out.println("행 길이 >> " + arr2.length);
		System.out.println("첫 번째 행 : 열 길이 >> >> " + arr2[0].length);
		System.out.println("첫 번째 행 : 열 길이 >> >> " + arr2[1].length);
		System.out.println();
		
		// 3. 중첩된 향상된 for 문
		System.out.println("중첩된 향상된 for 문");
		for (int[] i: arr2) {
			for (int j: i ) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
	} 
}
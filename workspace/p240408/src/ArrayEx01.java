
public class ArrayEx01 {

	public static void main(String[] args) {

		// 2차원 배열 생성
		// : 행 길이는 반드시 설정 - 생략 불가능
		// : 열 길이 생략 가능
		int[][] arr2 = new int[2][]; // 눈에는 안보이지만, Integer 로 바뀐거임
		System.out.println("arr2 : " + arr2);
		System.out.println("arr2[0] : " + arr2[0]);
		System.out.println("arr2[1] : " + arr2[1]);
		
		// 열 : 1차원 배열 생성
		arr2[0] = new int[3];
		arr2[1] = new int[] {8};
		
		// 향상된 for 문
		for(int[] row: arr2) {
			for (int column: row) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
		
	}
}

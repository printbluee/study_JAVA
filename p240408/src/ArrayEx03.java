
public class ArrayEx03 {

	public static void main(String[] args) {
		
		// 1차원 배열 생성
		int[] arr = {2, 4, 6};
		
		// enhanced for loop : 출력
		System.out.println("1차 출력");
		for (int ar: arr) {
			System.out.print(ar + " ");
		}
		System.out.println();
		
		// enhanced for loop : 요소 값 변경
		System.out.println("2차 출력 - 요소 값 변경");
		for (int ar: arr) {
			ar += 1;
			System.out.print(ar + " ");
		}
		System.out.println();
		
		// enhanced for loop : 변경된 요소 값 출력
		System.out.println("3차 출력");
		for (int ar: arr) {
			System.out.print(ar + " ");
		}
	}

}

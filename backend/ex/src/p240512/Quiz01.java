
package p240512;

public class Quiz01 {
	
	/*
	 * [문제]
	 * 출력 문구와 같이 홀수만 나오며, 5개의 수로 나열 되도록 출력하시오.
	 * 
	 * <출력 문구>
	 * 1  3  5  7  9
	 * 11 13 15 17 19
	 * ...
	 * 81 83 85 87 89
	 * 91 93 95 97 99
	 */
	
	public static void main(String[] args) {
		
        int count = 0; // 출력된 숫자의 개수

        for (int i = 1; i <= 99; i += 2) { // 홀수만 출력
            System.out.print(i + " ");
            count++;

            if (count == 5) { // 5개 출력 후 줄바꿈
                System.out.println();
                count = 0; // 숫자 개수 초기화
            }
        }
    }
}
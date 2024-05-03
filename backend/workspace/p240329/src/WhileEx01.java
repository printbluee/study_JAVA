
/*
 * [반복문] while 문
 *
 * 초기값 설정;
 *
 * while (조건식) { // 조건이 true 일 동안 반복 -> 처음으로 false 가 되는 순간 탈출
 * 	명령어;
 * 	증감식;
 * }
 * 
 * 
 */

public class WhileEx01 {

	public static void main(String[] args) {

		int num = 1;
		
		while (num < 3) {
			System.out.println("num >> " +  num);
			num++;
		} 
		
		System.out.println("실행 종료 !");
		
		
	}

}

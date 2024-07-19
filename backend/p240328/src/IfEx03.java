
/*
 * [ 조건문 ] if문 ========================
 * 
 * << 조건 1개일 경우 >>
 * if(조건식) {
 * 	조건이 true일 때, 실행되는 영역;
 *  명령어;
 * }
 * 
 * << 조건 2개일 경우 >>
 * if(조건식) {
 * 	조건이 true일 때, 실행되는 영역;
 *  명령어;
 * } else {
 * 	조건이 false일때, 실행되는 영역;
 * 	명령어;
 * }
 * 
 * << 조건 3개일 경우 >>
 * if(조건식) {
 * 	조건이 true 일 때, 실행되는 영역;
 *  명령어;
 * } else if (조건식2) {
 * 	조건식2이 true 일때, 실행되는 영역;
 * 	명령어;
 * } else {
 * 	조건이 false 일 때, 실행되는 영역;
 * 	명령어;
 * }
 * 
 */

public class IfEx03 {

	public static void main(String[] args) {
		
		int num = 0;
		
		if(num > 0) {
			System.out.println("양수 입니다.");
		} else if(num < 0) {
			System.out.println("음수 입니다.");
		} else {
			System.out.println("0 입니다.");
		}
		
		System.out.println("프로그램 종료 !");
		
	}
}
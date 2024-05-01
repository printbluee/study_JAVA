
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

public class IfEx01 {

	public static void main(String[] args) {
		
		int num = 5;
		
		if(num >= 10) {
			num++; // 후 증가
			System.out.println("true일 때, 실행되는 영역 ");
		} 
		
		System.out.println("num : " + num);
	}
}

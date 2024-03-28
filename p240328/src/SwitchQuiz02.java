
/*
 * [ 과제 7 ]
 * if 문을 switch 문으로 바꿔라
 */

public class SwitchQuiz02 {

	public static void main(String[] args) {
		
		int num = 25;
//		
//		if (num >= 0 && num < 10) {
//			System.out.println("0 이상 10 미만의 수");
//		} else if (num >= 10 && num < 20) {
//			System.out.println("10 이상 20 미만의 수");
//		} else if (num >= 20 && num < 30) {
//			System.out.println("20 이상 30 미만의 수");
//		}
	
		switch (num) {
		case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9: 
			System.out.println("0 이상 10 미만의 수");
			break;
		case 10, 11, 12, 13, 14, 15, 16, 17, 18, 19: 
			System.out.println("11 이상 20 미만의 수");
			break;
		case 20, 21, 22, 23, 24, 25, 26, 27, 28, 29: 
			System.out.println("21 이상 30 미만의 수");
			break;
		default:
			System.out.println("그 외의 수입니다.");
			break;
		}
	}
}

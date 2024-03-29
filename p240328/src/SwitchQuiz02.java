
/*
 * [ 과제 7 ]
 * if 문을 switch 문으로 바꿔라
 */

public class SwitchQuiz02 {

	public static void main(String[] args) {
		
		int num = 11;
		
//		if (num >= 0 && num < 10) {
//			System.out.println("0 이상 10 미만의 수");
//		} else if (num >= 10 && num < 20) {
//			System.out.println("10 이상 20 미만의 수");
//		} else if (num >= 20 && num < 30) {
//			System.out.println("20 이상 30 미만의 수");
//		}
	
		switch (num/10) { // 몫
		case 0: 
			System.out.println("0 이상 10 미만의 수");
			break;
		case 1: 
			System.out.println("11 이상 20 미만의 수");
			break;
		case 2: 
			System.out.println("21 이상 30 미만의 수");
			break;
		default:
			System.out.println("30 이상의 수");
			break;
		}

		
	}
}

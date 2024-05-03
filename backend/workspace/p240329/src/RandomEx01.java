
public class RandomEx01 {

	public static void main(String[] args) {

		/*
		 * [ 랜덤값 ]
		 * 문법 : Math(클래스).random()
		 * 0 <= 랜덤값 < 1
		 * 0 이상 1 미만의 랜덤값
		 */
		
		// 랜덤값 : 1 ~ 3
		System.out.println((int)(Math.random() * 3) + 1);
		
		// 랜덤값 : 1 ~ 45
		System.out.println((int)(Math.random() * 45) + 1);
		
	}

}

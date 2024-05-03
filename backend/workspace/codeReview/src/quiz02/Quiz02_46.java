package quiz02;

/*
 * [진혜정]
 * - 사용자에게 정수를 입력받지 않았습니다.
 * - num1, num2 ~ 등 의미 없는 변수 선언하셨습니다.
 * - 비교하는 식이 없습니다.
 */

public class Quiz02_46 {

	public static void main(String[] args) {
		
//		[메서드 정의]
//		컴퓨터가 생성한 1~10 사이의 랜덤값을 맞춘다.
//      마지막에는 사용자가 랜덤값을 몇 번 만에 맞췄는 지(횟수) 출력한다. 
		
//		[2-1] 정수형 변수 random을 선언하여, 1~10 사이의 랜덤값을 저장하기
//      문법 : Math.random()
//      1 <= 랜덤값 <= 10 (1이상 10이하의 랜덤값)
//      랜덤값 : 1 ~ 10		
	    int random = ((int)(Math.random()*10)+1);
	    System.out.println("1~10 랜덤값 : " + random);
	    
//      [2-2, 3, 4] 사용자가 입력한 값과 랜덤값을 비교 후 출력하시오.
	    
	    int num1 = 8;
	    System.out.println("컴퓨터의 숫자가 더 작습니다."); 
	    
	    int num2 = 1;
	    System.out.println("컴퓨터의 숫자가 더 큽니다.");
	    
	    int num3 = 5;
	    System.out.println("컴퓨터의 숫자가 더 작습니다.");
	    
	    int num4 = 3;
	    System.out.println("4번 만에 정답입니다.");
			
		
	}

}

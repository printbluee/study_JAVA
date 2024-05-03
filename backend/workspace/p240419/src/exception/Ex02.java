package exception;
import java.util.Scanner;

class NegativeNumberExcetion extends Exception { // Exception 부모를 둔 NegativeNumberExcetion 클래스
	
	private static final long serialVersionUID = 1L; // 공유 번호 넣어줘야 함

	public NegativeNumberExcetion(int number) {
		super("음수 " + number + "를 입력하셨군요 !");
	}
}

public class Ex02 {

	public static void inputNumber() throws NegativeNumberExcetion {
		Scanner input = new Scanner(System.in);
		System.out.print("정수 1개를 입력하세요... ");
		
		int userNumber = input.nextInt();
		input.close();
		
		if (userNumber < 0) {
			throw new NegativeNumberExcetion(userNumber); // 인스턴스 객체를 생성하고 throw 후 NegativeNumberExcetion 넘어감
		}
		
		System.out.println("입력된 값 : " + userNumber);
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("[main] 시작");
		try {
			inputNumber();
		} catch (NegativeNumberExcetion e) {
			System.out.println("e >> " + e.getMessage());
		}
		
		System.out.println("[main] 종료");
		 
	}
}

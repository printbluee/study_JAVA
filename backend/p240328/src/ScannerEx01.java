import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		
		// 변수 선언
		// int 자료형으로 선언된 변수 num
		int num = 5;
		System.out.println("num에 저장된 값 => " + num);
		
		// Scanner 객체 생성
		// Scanner 자료형으로 선언된 변수 input
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 1개 입력하세요 ... ");

		// 정수 입력
		// nextInt() : Int 를 입력받을 때
		num = input.nextInt();
		System.out.println("입력 받은 값 => " + num);
		
		input.close();
	}

}

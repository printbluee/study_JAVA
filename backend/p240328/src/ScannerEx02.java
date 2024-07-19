import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {
		
		// 1. Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		//2. 문자열 입력
		System.out.println("문자열 입력하세요 . . .");
		String str = input.nextLine();
		
		//3. 출력
		System.out.println("입력받은 문자열 : " + str);
		input.close();
		
	}

}

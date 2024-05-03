import java.util.Scanner;

public class ScannerSring {

	public static void main(String[] args) {
		
		// 1. Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 2-1. 문자열 입력 : next() - 첫 번째 공백 전까지만 입력
		System.out.print("문자열 입력하세요 . . . ");
		String str1 = input.next();
		
		// 2-2. 문자열 입력 : nextLine() - 엔터까지 입력
		// Enter : CRLF = \r\n
		// CR : Carriage Return -> \r
		// LF : Line Feed 		-> \n
		System.out.print("문자열 입력하세요 . . . ");
		String str2 = input.nextLine();
		
		System.out.println("str1 >>" + str1);
		System.out.println("str2 >>" + str2);

		// 메모리 해제
		input.close();
		
	}

}

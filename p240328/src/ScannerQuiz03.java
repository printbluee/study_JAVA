import java.util.Scanner;

public class ScannerQuiz03 {

	public static void main(String[] args) {
		
		/*
		 * [ 과제 2 ]==========================================
		 * 1. 정수   1개를 입력 받은 후 출력
		 * 2. 문자열 1개를 입력 받은 후 출력
		 * 
		 * < 출력 문구 >
		 * 정수   : 
		 * 문자열 :  
		 * 
		 * ==================================================
		 */
		
		// 1. Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 2. 정수 1개를 입력 받은 후 출력
		int num = input.nextInt();
		System.out.println("정수   : " + num);
		
		// 3. nextline 제외 메서드 이후 빈 nextLine 실행
		input.nextLine(); 
		
		// 4. 문자열 1개를 입력 받은 후 출력
		String str = input.nextLine();
		System.out.println("문자열 : " + str);
		
		// 5. scanner 닫기(오류 방지)
		input.close();
	
	}

}

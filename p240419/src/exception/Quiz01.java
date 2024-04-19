package exception;

import java.util.Scanner;

/*
 * [예외 클래스 정의]
 * 1) Quiz01 클래스 내 
 *    사용자에게 이름을 입력 받고, 출력하는 inputName() 정의 main (메소드에서 호출)
 * 2) 이름이 한 글자만 입력되면, NameLengthException 예외 발생
 * 3) 예외가 발생했을 때의 메세지는 잘못된 이름 입력
 * 	  <출력 문구> - class명(에러타입) : 잘못된 이름 입력
 * 
 * <출력 문구>
 * 이름을 입력하시오(2글자 이상 입력) >>> 홍길동
 * 입력된 이름 : 홍길동
 * 
 * 
 * 이름을 입력하시오(2글자 이상 입력) >>> 홍
 * 에러메세지: 잘못된 이름 입력
 */



class NameLengthException extends Exception {

	private static final long serialVersionUID = 1L;
	
}

public class Quiz01 {

	public static void inputName() throws NameLengthException {
		
		Scanner input = new Scanner(System.in);
		System.out.print("이름을 입력하시오.(2글자 이상 입력) >> ");
		String userValue = input.next();
		input.close();
		
		if (userValue.length() <= 1) {
			throw new NameLengthException();
		} else {
			System.out.println("입력된 이름 : " + userValue);
		}
	}
	
	public static void main(String[] args) {
		
		try {
			inputName();
		} catch (NameLengthException e) {
			System.out.println(e + ": 잘못된 이름 입력");
		}
	}
}
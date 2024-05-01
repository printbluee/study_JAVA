package item;

import java.util.Scanner;

public class ItemView {

	// field
	public static final Scanner INPUT = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("\n<< 상품 관리 >>"
				+ "1. 상품 저장"
				+ "2. 상품 조회"
				+ "3. 상품 수정"
				+ "4. 상품 삭제"
				+ "5. 상품 전체 조회"
				+ "6. 상품 전체 삭제"
				+ "7. 프로그램 종료"
				+ "\n원하는 기능을 선택하세요 ... ");
	}
}

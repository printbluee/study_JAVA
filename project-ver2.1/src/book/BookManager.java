package book;

import java.util.Scanner;

public class BookManager {
	
	private final int MAX_CNT = 5;
	private AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT];
	private int index = 0;
	
	// 1. 정보 입력
	public void inputData() {
		@SuppressWarnings("resource") 
		Scanner input = new Scanner(System.in);
		
		System.out.println("<< 정보를 입력하세요 >>");
		System.out.print("1. 이름 : ");
		String name = input.next();
		System.out.print("2. 나이 : ");
		int age = input.nextInt();
		
		boolean check = false;
		for (int i=0; i<index; i++) {
			if (infoStorage[i].getName().equals(name)) {
				check = true;
			}
		}
		
		if (check) {
			System.out.println("이미 저정된 이름입니다.\n");
		} else {
			infoStorage[index++] = new AnimalInfo(name, age);
			System.out.println("데이터 입력이 완료되었습니다.\n");
		}
	}
	
	// 2. 정보 검색
	public void searchData() {
		@SuppressWarnings("resource") 
		Scanner input = new Scanner(System.in);
		
		System.out.print("검색할 이름을 입력하세요 ... ");
		String name = input.next();
		
		boolean find = false;
		for (int i=0; i<index; i++) {
			if (infoStorage[i] == null) {
				continue;
			} else if (infoStorage[i].getName().equals(name)) {
				infoStorage[i].showAnimalInfo();
				System.out.println();
				find = true;
			}
		}
		if (! find) {
			System.out.println("해당 데이터는 없습니다.\n");
		}
	}
	
	// 3. 정보 수정
	public void updataData() {
		@SuppressWarnings("resource") 
		Scanner input = new Scanner(System.in);
		
		System.out.print("수정할 이름을 입력하세요 ... ");
		String name = input.nextLine();
		System.out.print("나이를 입력하세요 ...");
		int age = input.nextInt();
		
		for (int i=0; i<index; i++) {
			if (infoStorage[i].getName().equals(name)) {
				infoStorage[i].setAge(age);
			} 
		}
		System.out.println("수정이 완료되었습니다.\n");
	}
	
	// 4. 정보 삭제
	public void deleteData() {
		@SuppressWarnings("resource") 
		Scanner input = new Scanner(System.in);
		
		System.out.print("삭제할 이름을 입력하세요 ... ");
		String name = input.nextLine();
		
		for (int i=0; i<index; i++) {
			if (infoStorage[i].getName().equals(name)) {
				infoStorage[i] = null;
				break;
			} 
		}
		System.out.println("삭제가 완료되었습니다.\n");
	}
	
	// 5. 전체 정보
	public void showBook() {
		System.out.println("<< 저장 목록 >>");
		for (AnimalInfo info : infoStorage) {
			if (info != null) {
				info.showAnimalInfo();
				System.out.println();
			}
		}
	}
}
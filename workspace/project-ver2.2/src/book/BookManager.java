package book;

import java.util.Scanner;

public class BookManager {
	
	private final int MAX_CNT = 5;
	private AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT];
	private int index = 0;

	// [메뉴 출력] ==================================================
	public void show() {
		System.out.println("\n[ 메뉴를 선택하세요 ]");
	    System.out.println("1. 정보 입력\n2. 정보 검색\n3. 정보 수정\n4. 정보 삭제\n5. 전체 정보\n6. 종료");
	    System.out.print("선택 ... ");
	}
	// [중복 검사] ==================================================
	public int search(String name) {
		for (int i=0; i<index; i++) {
			if (infoStorage[i].getName().equals(name)) {
				return i;
			} 
		}
		return -1;
	}
	// [1. 정보 입력(저장)] =========================================
	public void inputData(Scanner input) {
		System.out.println("<< 정보를 입력하세요 >>");
		System.out.print("1. 이름 : ");
		String name = input.next();
		
		if (search(name) != -1) {
			System.out.println("이미 저장된 이름입니다.");
			return;
		}
		System.out.print("2. 나이 : ");
		int age = input.nextInt();
		
		infoStorage[index++] = new AnimalInfo(name, age);
		System.out.println("데이터 입력이 완료되었습니다.");
	}
	// [2. 정보 검색] ===============================================
	public void searchData(Scanner input) {
		System.out.print("검색할 이름을 입력하세요 ... ");
		String name = input.next();
		
		if (search(name) != -1) {
			infoStorage[search(name)].showAnimalInfo();
			System.out.println();
			return;
		}
		System.out.println("해당 데이터는 없습니다.");
	}
	// [3. 정보 수정] ===============================================
	public void updataData(Scanner input) {
		System.out.print("수정할 이름을 입력하세요 ... ");
		String name = input.next();
		
		if (search(name) != -1) {
			System.out.print("나이를 입력하세요 ...");
			int age = input.nextInt();
			
			infoStorage[search(name)].setAge(age);
			System.out.println("수정이 완료되었습니다.");
			return;
		}
		System.out.println("해당 데이터는 없습니다.");
	}
	// [4. 정보 삭제] ===============================================
	public void deleteData(Scanner input) {
		System.out.print("삭제할 이름을 입력하세요 ... ");
		String name = input.next();
		
		if (search(name) != -1) {
			for (int j=search(name); j<index; j++) {
				infoStorage[j] = infoStorage[j+1];
				
			}
			index--;
			System.out.println("삭제가 완료되었습니다.");
			return;
		}
		System.out.println("해당 데이터는 없습니다.");
	}
	// [5. 전체 정보 출력] ==========================================
	public void showBook() {
		System.out.println("<< 저장 목록 >>");
		for(int i=0; i<index; i++) {
			infoStorage[i].showAnimalInfo();
			System.out.println();
		}
	}
}
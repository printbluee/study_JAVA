package book;

import java.util.Scanner;

public class BookManager {
	
	private final int MAX_CNT = 5;
	private AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT];
	private int index = 0;

	public void show() {
		System.out.println("[ 메뉴를 선택하세요 ]");
	    System.out.println("1. 정보 입력\n2. 정보 검색\n3. 정보 수정\n4. 정보 삭제\n5. 전체 정보\n6. 종료");
	    System.out.print("선택 ... ");
	}
	
	// [1. 정보 입력(저장)] =========================================
	public void inputData() {
		@SuppressWarnings("resource") 
		Scanner input = new Scanner(System.in);
		
		System.out.println("<< 정보를 입력하세요 >>");
		System.out.print("1. 이름 : ");
		String name = input.next();
		System.out.print("2. 나이 : ");
		int age = input.nextInt();
		
		for (int i=0; i<index; i++) {
			if (infoStorage[i].getName().equals(name)) {
				System.out.println("이미 저장된 이름입니다.\n");
				return;
			}
		}
		infoStorage[index++] = new AnimalInfo(name, age);
		System.out.println("데이터 입력이 완료되었습니다.\n");
	}
	// [2. 정보 검색] ===============================================
	public void searchData() {
		@SuppressWarnings("resource") 
		Scanner input = new Scanner(System.in);
		
		System.out.print("검색할 이름을 입력하세요 ... ");
		String name = input.next();
		
		for (int i=0; i<index; i++) {
			if (infoStorage[i].getName().equals(name)) {
				infoStorage[i].showAnimalInfo();
				System.out.println();
				return;
			} 
		}
		System.out.println("해당 데이터는 없습니다.\n");
	}
	// [3. 정보 수정] ===============================================
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
				System.out.println("수정이 완료되었습니다.\n");
				return;
			} 
		}
		System.out.println("해당 데이터는 없습니다.\n");
	}
	// [4. 정보 삭제] ===============================================
	public void deleteData() {
		@SuppressWarnings("resource") 
		Scanner input = new Scanner(System.in);
		
		System.out.print("삭제할 이름을 입력하세요 ... ");
		String name = input.next();
		
		for (int i=0; i<index; i++) {
			if (infoStorage[i].getName().equals(name)) {
				for (int j=i; j<index; j++) {
					infoStorage[j] = infoStorage[j+1];
				}
				index--;
				System.out.println("삭제가 완료되었습니다.\n");
				return;
			} 
		}
		System.out.println("해당 데이터는 없습니다.\n");
	}
	// [5. 전체 정보 출력] ==========================================
	public void showBook() {
		System.out.println("\n<< 저장 목록 >>");
		// [for문]
		for(int i=0; i<index; i++) {
			infoStorage[i].showAnimalInfo();
			System.out.println();
		}
		
		// [향상된 for문]
//		for(AnimalInfo info: infoStorage) {
//			if (info == null) {
//				break;
//			}
//			info.showAnimalInfo();
//			System.out.println();
//		}
	}
}